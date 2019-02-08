package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.Fdl;
import dsy.web.dao.FdlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-11-26
 */
@Service
@Transactional
public class FdlService {

    @Autowired
    private FdlDao fdlDao;

    public void syncFromStatsOfgov() throws Exception {
        String[] urls = {
                "http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22zb%22%2C%22valuecode%22%3A%22A03010G%22%7D%5D&k1=1543245519710", //发电量
                "http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22zb%22%2C%22valuecode%22%3A%22A03010H%22%7D%5D&k1=1543245642288", //火力发电
                "http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22zb%22%2C%22valuecode%22%3A%22A03010I%22%7D%5D&k1=1543245696227", //水力发电
                "http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22zb%22%2C%22valuecode%22%3A%22A03010J%22%7D%5D&k1=1543245721947", //核能发电
                "http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22zb%22%2C%22valuecode%22%3A%22A03010K%22%7D%5D&k1=1543245743915", //风力发电
                "http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22zb%22%2C%22valuecode%22%3A%22A03010L%22%7D%5D&k1=1543245770077", //太阳能发电
        };

        Map<String, Fdl> data = new HashMap<>();

        for(String url: urls) {
            String json = get(url, "UTF-8");

            Map<String, Object> jsonObject = JSON.parseObject(json);
            List<Map> dataNodes = (List) ((Map) jsonObject.get("returndata")).get("datanodes");

            for (Object o : dataNodes) {

                Map<String, Object> e = (Map) o;

                String code = (String) e.get("code");

                String[] items = code.split("\\.");

                String zb = items[1];
                String month = items[2];

                Object value = ((Map) e.get("data")).get("data");

                Fdl fdl = data.get(month);

                if (fdl == null) {
                    fdl = new Fdl();
                    fdl.setId(month);
                    fdl.setMonth(month);

                    data.put(month, fdl);
                }

                switch (zb) {
                    case "A03010G01_sj": //发电量

                        fdl.setFdl(parseDouble(value));
                        break;

                    case "A03010G03_sj":
                        fdl.setFdlYoy(parseDouble(value));

                    case "A03010H01_sj": //火力发电
                        fdl.setHlFdl(parseDouble(value));
                        break;

                    case "A03010H03_sj":
                        fdl.setHlFdlYoy(parseDouble(value));
                        break;

                    case "A03010I01_sj": //水利发电
                        fdl.setSlFdl(parseDouble(value));
                        break;

                    case "A03010I03_sj":
                        fdl.setSlFdlYoy(parseDouble(value));

                    case "A03010J01_sj": //核能发电
                        fdl.setHnFdl(parseDouble(value));
                        break;

                    case "A03010J03_sj":

                        fdl.setHnFdlYoy(parseDouble(value));
                        break;

                    case "A03010K01_sj": //风力发电

                        fdl.setFlFdl(parseDouble(value));
                        break;

                    case "A03010K03_sj":

                        fdl.setFlFdlYoy(parseDouble(value));
                        break;

                    case "A03010L01_sj": //太阳能发电

                        fdl.setTynFdl(parseDouble(value));
                        break;

                    case "A03010L03_sj":

                        fdl.setTynFdlYoy(parseDouble(value));
                        break;
                }
            }
        }

        for(Fdl fdl: data.values()) {
            fdlDao.save(fdl);
        }

    }

    double parseDouble(Object d) {

        try {
            return Double.parseDouble(d.toString());
        } catch (Exception e) {
            return 0.0;
        }
    }

    public List<Fdl> getAll() {
        return  fdlDao.getAll();
    }
}
