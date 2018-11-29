package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.ShangPin;
import dsy.web.dao.ShangPinDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import static dsy.core.tools.DateTool.getDayStr;
import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-11-29
 */
@Service
@Transactional
public class ShangPinService {

    @Autowired
    ShangPinDao shangPinDao;

    public void syncWhHqFromWallStreetCn() throws Exception {

        String url = "https://api-ddc.wallstreetcn.com/market/real?fields=symbol,prod_code,prod_name,prod_en_name,preclose_px,price_precision,open_px,high_px,low_px,week_52_high,week_52_low,update_time,last_px,px_change,px_change_rate,market_type,trade_status&prod_code=XAUUSD.OTC,USGC.OTC,XAGUSD.OTC,USSI.OTC,UKOIL.OTC,USCL.OTC";

        String json = get(url, "UTF-8");

        Map<String, Object> jsonObj = (Map) JSON.parse(json);

        Map<String, Object> data = (Map) jsonObj.get("data");

        Map<String, Object> snapshot = (Map) data.get("snapshot");

        snapshot.forEach((k, v) -> {

            List l = (List) v;

            ShangPin shangPin = new ShangPin();

            int index = 0;

            shangPin.setSymbol((String) l.get(index ++));
            shangPin.setProdCode((String) l.get(index ++));
            shangPin.setProdName((String) l.get(index ++));
            shangPin.setProdEnName((String) l.get(index ++));
            shangPin.setPreClosePx(parse(l.get(index ++)));
            shangPin.setPricePrecision((String) l.get(index ++));
            shangPin.setOpenPx(parse(l.get(index ++)));
            shangPin.setHighPx(parse(l.get(index ++)));
            shangPin.setLowPx(parse(l.get(index ++)));
            shangPin.setWeek52high(parse(l.get(index ++)));
            shangPin.setWeek52low(parse(l.get(index ++)));
            shangPin.setUpdateTime(Long.parseLong(l.get(index ++).toString()));
            shangPin.setLastPx(parse(l.get(index ++)));
            shangPin.setPxChange(parse(l.get(index ++)));
            shangPin.setPxChangeRate(parse(l.get(index ++)));

            shangPin.setMarketType((String) l.get(index ++));
            shangPin.setTradeStatus((String) l.get(index ++));

            shangPin.setDate(getDayStr(new Date(shangPin.getUpdateTime() * 1000)));
            shangPin.setId(shangPin.getSymbol() + shangPin.getDate());
            shangPinDao.merge(shangPin);
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
