package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.Wh;
import dsy.web.dao.WhDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static dsy.core.tools.DateTool.getDayStr;
import static dsy.core.tools.HttpClientTool.get;
import static dsy.core.tools.TradeTool.getLatestTrade;

/**
 * @author dong
 * @since 18-11-6
 */
@Service
@Transactional
public class WhService {

    @Autowired
    WhDao whDao;


    public void syncWhHqFromWallStreetCn() throws Exception {

        String url = "https://api-ddc.wallstreetcn.com/market/real?fields=symbol,prod_code,prod_name,prod_en_name,preclose_px,price_precision,open_px,high_px,low_px,week_52_high,week_52_low,update_time,last_px,px_change,px_change_rate,market_type,trade_status&prod_code=DXY.OTC,EURUSD.OTC,GBPUSD.OTC,USDJPY.OTC,USDCHF.OTC,USDCAD.OTC,AUDUSD.OTC,NZDUSD.OTC,USDCNY.OTC,USDCNH.OTC";

        String json = get(url, "UTF-8");

        Map<String, Object> jsonObj = (Map) JSON.parse(json);

        Map<String, Object> data = (Map) jsonObj.get("data");

        Map<String, Object> snapshot = (Map) data.get("snapshot");

        java.sql.Date latestTradeDate = new java.sql.Date(getLatestTrade().getTime());

        snapshot.forEach((k, v) -> {

            List l = (List) v;

            Wh wh = new Wh();

            int index = 0;

            wh.setSymbol((String) l.get(index ++));
            wh.setProdCode((String) l.get(index ++));
            wh.setProdName((String) l.get(index ++));
            wh.setProdEnName((String) l.get(index ++));
            wh.setPreClosePx(parse(l.get(index ++)));
            wh.setPricePrecision((String) l.get(index ++));
            wh.setOpenPx(parse(l.get(index ++)));
            wh.setHighPx(parse(l.get(index ++)));
            wh.setLowPx(parse(l.get(index ++)));
            wh.setWeek52high(parse(l.get(index ++)));
            wh.setWeek52low(parse(l.get(index ++)));
            wh.setUpdateTime(Long.parseLong(l.get(index ++).toString()));
            wh.setLastPx(parse(l.get(index ++)));
            wh.setPxChange(parse(l.get(index ++)));
            wh.setPxChangeRate(parse(l.get(index ++)));

            wh.setMarketType((String) l.get(index ++));
            wh.setTradeStatus((String) l.get(index ++));

            wh.setDate(latestTradeDate);
            wh.setId(wh.getSymbol() + getDayStr(new Date(wh.getUpdateTime())));
            whDao.merge(wh);
        });
    }

    private static Double parse(Object s) {

        try {
            return Double.parseDouble(s.toString());
        } catch (Exception e) {
            return 0.0;
        }
    }
}
