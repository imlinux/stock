package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.MarketType;
import dsy.core.entity.WallStreetCnHq;
import dsy.web.dao.WallStreetCnHqDao;
import dsy.web.dto.SearchCompany;
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
import static dsy.core.tools.HttpClientTool.get;
import static dsy.core.tools.ParseTool.parseDouble;
import static dsy.core.tools.TradeTool.getLatestTrade;

/**
 * @author dong
 * @since 18-11-1
 */
@Service
@Transactional
public class WallStreetCnHqService {

    @Autowired
    private WallStreetCnHqDao wallStreetCnHqDao;

    /**
     * 同步个股行情和基本信息
     * @throws Exception
     */
    public void syncStockHqFromWallStreetCn() throws Exception {
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

                WallStreetCnHq entity = new WallStreetCnHq();

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

                entity.setMarketType(MarketType.Stock);
                //update_time
                long time = (int) e.get(i++) * 1000L;

                //与东方财富保持一致
                entity.setProdCode(entity.getProdCode().replace(".SS", ".SH"));

                entity.setDate(new java.sql.Date(time));
                entity.setId(getDayStr(getDay(new Date(time))) + "_" + entity.getProdCode());
                wallStreetCnHqDao.merge(entity);
            }

        } finally {
            response.close();
        }
    }

    /**
     * 主要国家货币汇率行情
     * @throws Exception
     */
    public void syncWhHqFromWallStreetCn() throws Exception {

        String url = "https://api-ddc.wallstreetcn.com/market/real?fields=symbol,prod_code,prod_name,prod_en_name,preclose_px,price_precision,open_px,high_px,low_px,week_52_high,week_52_low,update_time,last_px,px_change,px_change_rate,market_type,trade_status&prod_code=DXY.OTC,EURUSD.OTC,GBPUSD.OTC,USDJPY.OTC,USDCHF.OTC,USDCAD.OTC,AUDUSD.OTC,NZDUSD.OTC,USDCNY.OTC,USDCNH.OTC";

        String json = get(url, "UTF-8");

        Map<String, Object> jsonObj = (Map) JSON.parse(json);

        Map<String, Object> data = (Map) jsonObj.get("data");

        Map<String, Object> snapshot = (Map) data.get("snapshot");

        Date latestTrade = getLatestTrade();
        snapshot.forEach((k, v) -> {

            List l = (List) v;

            WallStreetCnHq wh = new WallStreetCnHq();

            int index = 0;

            wh.setSymbol((String) l.get(index ++));
            wh.setProdCode((String) l.get(index ++));
            wh.setProdName((String) l.get(index ++));
            wh.setProdEnName((String) l.get(index ++));
            wh.setPreClosePx(parseDouble(l.get(index ++)));
            wh.setPricePrecision((String) l.get(index ++));
            wh.setOpenPx(parseDouble(l.get(index ++)));
            wh.setHighPx(parseDouble(l.get(index ++)));
            wh.setLowPx(parseDouble(l.get(index ++)));
            wh.setWeek52High(parseDouble(l.get(index ++)));
            wh.setWeek52Low(parseDouble(l.get(index ++)));
            wh.setUpdateTime(Long.parseLong(l.get(index ++).toString()));
            wh.setLastPx(parseDouble(l.get(index ++)));
            wh.setPxChange(parseDouble(l.get(index ++)));
            wh.setPxChangeRate(parseDouble(l.get(index ++)));

            wh.setMarketType(MarketType.ForeignData);
            wh.setTradeStatus((String) l.get(index ++));

            wh.setDate(new java.sql.Date(latestTrade.getTime()));
            wh.setId(wh.getSymbol() + getDayStr(latestTrade));
            wallStreetCnHqDao.merge(wh);
        });
    }

    /**
     * 根据关键字和代码搜索股票，
     * @param codeOrName
     * @return 结果按时间和成交额逆序排序
     */
    public List<SearchCompany> searchCompany(String codeOrName) {
        return wallStreetCnHqDao.searchCompany(codeOrName);
    }

    /**
     * 获取最新个股行情列表
     * @return
     * @throws Exception
     */
    public List<WallStreetCnHq> getLatestCompanyHq() throws Exception {

        return wallStreetCnHqDao.getLatestCompanyHq();
    }

    /**
     * 获取外汇行情列表
     * @return
     * @throws Exception
     */
    public List<WallStreetCnHq> getLatestWhHq() throws Exception {
        Date date = getLatestTrade();

        return wallStreetCnHqDao.getLatestWhHq(new java.sql.Date(date.getTime()));
    }

}