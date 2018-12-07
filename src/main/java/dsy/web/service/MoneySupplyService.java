package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.MoneySupply;
import dsy.web.dao.MoneySupplyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-23
 */
@Service
@Transactional
public class MoneySupplyService {

    @Autowired
    private MoneySupplyDao moneySupplyDao;



    public void syncFromStatsOfgov() throws Exception {
        String json = get("http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22zb%22%2C%22valuecode%22%3A%22A0D01%22%7D%5D&k1=1543224899419", "UTF-8");

        Map<String, Object> m = JSON.parseObject(json);

        List l = (List) ((Map)m.get("returndata")).get("datanodes");

        Map<String, MoneySupply> data = new HashMap<>();
        for(Object o : l) {
            Map<String, Object> e = (Map) o;

            String code = (String) e.get("code");

            boolean hasData = (Boolean) ((Map) e.get("data")).get("hasdata");

            if(!hasData) continue;

            Object value = ((Map) e.get("data")).get("data");

            String[] items = code.split("\\.");

            String zb = items[1]; //指标
            String date = items[2];

            MoneySupply rec = data.get(date);

            if(rec == null) {
                rec = new MoneySupply();
                rec.setId(date);
                rec.setMonth(date);
                data.put(date, rec);
            }

            switch (zb){
                case "A1B0101_sj":
                    rec.setM2(parseDouble(value));
                    break;
                case "A1B0102_sj":
                    rec.setM2yoy(parseDouble(value));
                    break;
                case "A1B0103_sj":
                    rec.setM1(parseDouble(value));
                    break;

                case "A1B0104_sj":
                    rec.setM1yoy(parseDouble(value));
                    break;

                case "A1B0105_sj":
                    rec.setM0(parseDouble(value));
                    break;

                case "A1B0106_sj":
                    rec.setM0yoy(parseDouble(value));
                    break;
            }
        }

        for(MoneySupply e: data.values()) {
            moneySupplyDao.merge(e);
        }
    }

    double parseDouble(Object d) {

        try {
            return Double.parseDouble(d.toString());
        } catch (Exception e) {
            return 0.0;
        }
    }


    public List<MoneySupply> getAll() {
        return moneySupplyDao.getAll();
    }
}
