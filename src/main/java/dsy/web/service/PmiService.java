package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.PMI;
import dsy.web.dao.PmiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-11-27
 */
@Service
@Transactional
public class PmiService {

    @Autowired
    private PmiDao pmiDao;

    public void syncFromStatsOfgov() throws Exception {

        String[] urls = {
                "http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22zb%22%2C%22valuecode%22%3A%22A1901%22%7D%5D&k1=1543298560493",
                "http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22zb%22%2C%22valuecode%22%3A%22A1902%22%7D%5D&k1=1543299061194"
        };

        Map<String, PMI> data = new HashMap<>();

        for (String url: urls) {
            String json = get(url, "UTF-8");

            Map<String, Object> jsonObj = (Map) JSON.parseObject(json);

            List datanodes = (List)((Map) jsonObj.get("returndata")).get("datanodes");

            for(Object o: datanodes) {
                Map<String, Object> e = (Map) o;

                String code = (String) e.get("code");

                String[] items = code.split("\\.");

                String zb = items[1];
                String month = items[2];

                Object value = ((Map) e.get("data")).get("data");

                PMI pmi = data.get(month);

                if(pmi == null) {
                    pmi = new PMI();
                    pmi.setId(month);
                    pmi.setMonth(month);

                    data.put(month, pmi);
                }

                switch (zb) {
                    case "A190101_sj":
                        pmi.setZzycgjlzs(parseDouble(value));
                        break;

                    case "A190201_sj":
                        pmi.setFzzycgjlzs(parseDouble(value));
                        break;
                }
            }
        }

        for(PMI pmi: data.values()) {
            pmiDao.merge(pmi);
        }
    }


    double parseDouble(Object d) {

        try {
            return Double.parseDouble(d.toString());
        } catch (Exception e) {
            return 0.0;
        }
    }


    public List<PMI> getALl() {

        return pmiDao.getAll();
    }
}
