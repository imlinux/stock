package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.MarketType;
import dsy.core.entity.WallStreetCnHq;
import dsy.web.dao.WallStreetCnHqDao;
import dsy.web.dto.SearchCompany;
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
import static dsy.core.tools.ParseTool.parseLong;
import static dsy.core.tools.TradeTool.getLatestTrade;
import static dsy.core.tools.TradeTool.getLatestTradeStr;

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

        String url = "https://api-ddc.wallstreetcn.com/market/rank?market_type=mdc&stk_type=stock&order_by=none&limit=6000&fields=prod_name,prod_en_name,prod_code,symbol,last_px,px_change,px_change_rate,open_px,high_px,low_px,week_52_high,week_52_low,price_precision,circulation_value,dyn_pe,dyn_pb_rate,turnover_value,turnover_ratio,turnover_volume,market_value,preclose_px,amplitude,trade_status,update_time&cursor=1";



        String s = get(url, "UTF-8");

        Map<String, Object> jsonObject = JSON.parseObject(s);

        Map<String, Object> dataNode = (Map) jsonObject.get("data");

        List<List> candleNode = (List) dataNode.get("candle");

        for(List e: candleNode) {

            WallStreetCnHq hq = new WallStreetCnHq();

            int i = 0;

            hq.setProdName((String) e.get(i ++));
            hq.setProdEnName((String) e.get(i ++));
            hq.setProdCode((String) e.get(i++));
            hq.setSymbol((String) e.get(i++));

            hq.setLastPx(Double.parseDouble(e.get(i++).toString()));
            hq.setClosePx(hq.getLastPx());

            hq.setPxChange(Double.parseDouble(e.get(i++).toString()));
            hq.setPxChangeRate(Double.parseDouble(e.get(i++).toString()));
            hq.setOpenPx(Double.parseDouble(e.get(i++).toString()));
            hq.setHighPx(Double.parseDouble(e.get(i++).toString()));
            hq.setLowPx(Double.parseDouble(e.get(i++).toString()));
            hq.setWeek52High(Double.parseDouble(e.get(i++).toString()));
            hq.setWeek52Low(Double.parseDouble(e.get(i++).toString()));
            hq.setPricePrecision((String) e.get(i++));
            hq.setCirculationValue(Double.parseDouble(e.get(i++).toString()));
            hq.setDynPe(Double.parseDouble(e.get(i++).toString()));
            hq.setDynPbRate(Double.parseDouble(e.get(i++).toString()));
            hq.setTurnoverValue(Double.parseDouble(e.get(i++).toString()));
            hq.setTurnoverRatio(Double.parseDouble(e.get(i++).toString()));
            hq.setTurnoverVolume(Double.parseDouble(e.get(i++).toString()));
            hq.setMarketValue(Double.parseDouble(e.get(i++).toString()));
            hq.setPreClosePx(Double.parseDouble(e.get(i++).toString()));
            hq.setAmplitude(Double.parseDouble(e.get(i++).toString()));
            hq.setTradeStatus((String) e.get(i++));

            hq.setMarketType(MarketType.Stock);
            //update_time
            long time = (int) e.get(i++) * 1000L;

            //与东方财富保持一致
            hq.setProdCode(hq.getProdCode().replace(".SS", ".SH"));

            hq.setDate(getDayStr(new Date(time)));
            hq.setId(getDayStr(getDay(new Date(time))) + "_" + hq.getProdCode());
            wallStreetCnHqDao.merge(hq);

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
            wh.setClosePx(wh.getLastPx());

            wh.setPxChange(parseDouble(l.get(index ++)));
            wh.setPxChangeRate(parseDouble(l.get(index ++)));

            wh.setMarketType(MarketType.ForeignData);
            wh.setTradeStatus((String) l.get(index ++));

            wh.setDate(getDayStr(new Date(latestTrade.getTime())));
            wh.setId(wh.getSymbol() + getDayStr(latestTrade));
            wallStreetCnHqDao.merge(wh);
        });
    }

    /**
     * 同步最新债券行情
     * @throws Exception
     */
    public void syncStockBondFromWallStreetCn() throws Exception {

        String url = "https://api-ddc.wallstreetcn.com/market/rank?market_type=forexdata&stk_type=bond&order_by=none&sort_field=px_change_rate&limit=1000&fields=prod_name,prod_en_name,prod_code,symbol,last_px,px_change,px_change_rate,high_px,low_px,week_52_high,week_52_low,price_precision,update_time&cursor=0";

        String s = get(url, "UTF-8");

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
            entity.setClosePx(entity.getLastPx());

            entity.setPxChange(Double.parseDouble(e.get(i++).toString()));
            entity.setPxChangeRate(Double.parseDouble(e.get(i++).toString()));
            //entity.setOpenPx(Double.parseDouble(e.get(i++).toString()));
            entity.setHighPx(Double.parseDouble(e.get(i++).toString()));
            entity.setLowPx(Double.parseDouble(e.get(i++).toString()));
            entity.setWeek52High(Double.parseDouble(e.get(i++).toString()));
            entity.setWeek52Low(Double.parseDouble(e.get(i++).toString()));
            entity.setPricePrecision((String) e.get(i++));
            //entity.setCirculationValue(Double.parseDouble(e.get(i++).toString()));
            //                entity.setDynPe(Double.parseDouble(e.get(i++).toString()));
            //                entity.setDynPbRate(Double.parseDouble(e.get(i++).toString()));
            //                entity.setTurnoverValue(Double.parseDouble(e.get(i++).toString()));
            //                entity.setTurnoverRatio(Double.parseDouble(e.get(i++).toString()));
            //                entity.setTurnoverVolume(Double.parseDouble(e.get(i++).toString()));
            //                entity.setMarketValue(Double.parseDouble(e.get(i++).toString()));
            //                entity.setPreClosePx(Double.parseDouble(e.get(i++).toString()));
            //                entity.setAmplitude(Double.parseDouble(e.get(i++).toString()));
            //                entity.setTradeStatus((String) e.get(i++));

            entity.setMarketType(MarketType.Bond);
            //update_time
            long time = (int) e.get(i++) * 1000L;

            entity.setDate(getDayStr(new Date(time)));
            entity.setId(getDayStr(getDay(new Date(time))) + "_" + entity.getProdCode());
            wallStreetCnHqDao.merge(entity);
            }
    }

    public void syncHqByCodeFromWallStreetCn(String code, MarketType marketType) throws Exception {

        String url = "https://api-ddc.wallstreetcn.com/market/kline?fields=prod_code,tick_at,open_px,close_px,high_px,low_px,turnover_volume,turnover_value,average_px,px_change,px_change_rate,avg_px,ma2&prod_code=" + code + "&period_type=86400&tick_count=256";
        String jsonText = get(url, "UTF-8");
        Map<String, Object> jsonObj = JSON.parseObject(jsonText);
        Map<String, Object> candleData = (Map) ((Map) jsonObj.get("data")).get("candle");
        List<String> fields = (List) ((Map) jsonObj.get("data")).get("fields");

        candleData.forEach((k, v) -> {
            Map<String, Object> lines = (Map) v;
            List l = (List) lines.get("lines");
            l.forEach( e -> {

                List items = (List) e;

                WallStreetCnHq hq = new WallStreetCnHq();

                hq.setProdCode((String) items.get(fields.indexOf("prod_code")));
                hq.setOpenPx(parseDouble(items.get(fields.indexOf("open_px"))));

                hq.setClosePx(parseDouble(items.get(fields.indexOf("close_px"))));
                hq.setLastPx(hq.getClosePx());

                hq.setHighPx(parseDouble(items.get(fields.indexOf("high_px"))));
                hq.setLowPx(parseDouble(items.get(fields.indexOf("low_px"))));

                hq.setPxChange(parseDouble(items.get(fields.indexOf("px_change"))));
                hq.setPxChangeRate(parseDouble(items.get(fields.indexOf("px_change_rate"))));

                hq.setTurnoverVolume(parseDouble(items.get(fields.indexOf("turnover_volume"))));
                hq.setTurnoverValue(parseDouble(items.get(fields.indexOf("turnover_value"))));

                hq.setDate(getDayStr(new Date(parseLong(items.get(fields.indexOf("tick_at"))) * 1000)));


                hq.setId(hq.getDate() + "_" + hq.getProdCode());

                hq.setMarketType(marketType);
                wallStreetCnHqDao.merge(hq);
            });
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

        return wallStreetCnHqDao.getLatestWhHq(getLatestTradeStr());
    }

    public List<WallStreetCnHq> getAllBondHq() throws Exception {

        return wallStreetCnHqDao.getAllBond();
    }

}
