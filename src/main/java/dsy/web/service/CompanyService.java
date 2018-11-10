package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.CompanyHQ;
import dsy.core.entity.WallStreetcnCompanyHQ;
import dsy.web.dao.CompanyDao;
import dsy.web.dao.IndustryDao;
import dsy.web.dto.QueryCompany;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static dsy.core.tools.DateTool.getDay;
import static dsy.core.tools.DateTool.getDayStr;
import static dsy.core.tools.TradeTool.getLatestTrade;

/**
 * @author dong
 * @since 18-11-1
 */
@Service
@Transactional
public class CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    IndustryDao industryDao;

    public void syncCompanyFromSina() throws Exception {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        java.sql.Date latestTradeDate = new java.sql.Date(getLatestTrade().getTime());

        for (int i = 1;true; i++) {
            HttpGet httpGet = new HttpGet("http://vip.stock.finance.sina.com.cn/quotes_service/api/json_v2.php/Market_Center.getHQNodeData?num=80&sort=symbol&asc=1&node=hs_a&symbol=&_s_r_a=page&page=" + i);

            CloseableHttpResponse response = httpClient.execute(httpGet);

            try {
                HttpEntity entity1 = response.getEntity();

                String s = IOUtils.toString(entity1.getContent(), "GBK");

                try {
                    List<CompanyHQ> companyHQList = JSON.parseArray(s, CompanyHQ.class);

                    Thread.sleep(1000);
                    for (CompanyHQ e : companyHQList) {
                        e.setId(e.getCode() + "_" + getDayStr(latestTradeDate));
                        e.setDate(latestTradeDate);
                        companyDao.merge(e);
                    }
                } catch (Exception e) {
                    break;
                }


            } finally {
                response.close();
            }
        }
    }

    public void syncCompayFromWallStreetCn() throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("https://api-ddc.wallstreetcn.com/market/rank?market_type=mdc&stk_type=stock&order_by=none&limit=6000&fields=prod_name,prod_en_name,prod_code,symbol,last_px,px_change,px_change_rate,open_px,high_px,low_px,week_52_high,week_52_low,price_precision,circulation_value,dyn_pe,dyn_pb_rate,turnover_value,turnover_ratio,turnover_volume,market_value,preclose_px,amplitude,trade_status,update_time&cursor=1");

        CloseableHttpResponse response = httpClient.execute(httpGet);

        try {
            HttpEntity entity1 = response.getEntity();

            String s = IOUtils.toString(entity1.getContent(), "UTF-8");

            Map<String, Object> jsonObject = JSON.parseObject(s);

            Map<String, Object> dataNode = (Map) jsonObject.get("data");

            List<List> candleNode = (List) dataNode.get("candle");

            for(List e: candleNode) {

                WallStreetcnCompanyHQ entity = new WallStreetcnCompanyHQ();

                int i = 0;

                entity.setProdName((String) e.get(i ++));
                entity.setProdEnName((String) e.get(i ++));
                entity.setProdCode((String) e.get(i++));
                entity.setSymbol((String) e.get(i++));
                entity.setLastPx(Double.parseDouble(e.get(i++).toString()));
                entity.setPxChange(Double.parseDouble(e.get(i++).toString()));
                entity.setPxChangeRate(Double.parseDouble(e.get(i++).toString()));
                entity.setOpenPx(Double.parseDouble(e.get(i++).toString()));
                entity.setHighPx(Double.parseDouble(e.get(i++).toString()));
                entity.setLowPx(Double.parseDouble(e.get(i++).toString()));
                entity.setWeek52High(Double.parseDouble(e.get(i++).toString()));
                entity.setWeek52Low(Double.parseDouble(e.get(i++).toString()));
                entity.setPricePrecision((String) e.get(i++));
                entity.setCirculationValue(Double.parseDouble(e.get(i++).toString()));
                entity.setDynPe(Double.parseDouble(e.get(i++).toString()));
                entity.setDynPbRate(Double.parseDouble(e.get(i++).toString()));
                entity.setTurnoverValue(Double.parseDouble(e.get(i++).toString()));
                entity.setTurnoverRatio(Double.parseDouble(e.get(i++).toString()));
                entity.setTurnoverVolume(Double.parseDouble(e.get(i++).toString()));
                entity.setMarketValue(Double.parseDouble(e.get(i++).toString()));
                entity.setPreClosePx(Double.parseDouble(e.get(i++).toString()));
                entity.setAmplitude(Double.parseDouble(e.get(i++).toString()));
                entity.setTradeStatus((String) e.get(i++));

                //update_time
                long time = (int) e.get(i++) * 1000L;

                entity.setDate(new java.sql.Date(time));
                entity.setId(getDayStr(getDay(new Date(time))) + "_" + entity.getProdCode());
                companyDao.merge(entity);
            }

        } finally {
            response.close();
        }
    }

    public List<QueryCompany> queryCompany(String codeOrName) {
        return companyDao.queryCompany(codeOrName);
    }

}
