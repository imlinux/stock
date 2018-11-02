package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.Gdp;
import dsy.web.dao.GdpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-22
 */
@Service
@Transactional
public class GdpService {

    @Autowired
    GdpDao gdpDao;

    public List<Gdp> getGdpYear() {
        return gdpDao.findAll();
    }

    public Gdp getLatest() {
        return gdpDao.getLatestGdp();
    }


    public void syncFromSina() throws Exception {

        String url = "http://money.finance.sina.com.cn/mac/api/jsonp.php/SINAREMOTECALLCALLBACK1790363682808/MacPage_Service.get_pagedata?cate=nation&event=1&from=0&num=250&condition=&_=1790363682808";

        String json = get(url, "GBK");

        Pattern p = Pattern.compile("\\,count:(.*?)\\}");

        Matcher m = p.matcher(json);

        if(m.find()) {
            String s = m.group(1);
            s = s.split("data:")[1];
            s = s.replace("null", "0");

            List l = JSON.parseArray(s);

            for (Object o: l) {

                List e = (List) o;

                Gdp gdp = new Gdp();

                int index = 0;

                gdp.setQuarter(e.get(index ++).toString());
                gdp.setGdp(parse(e.get(index ++)));
                gdp.setGdpYoy(parse(e.get(index ++)));
                gdp.setPi(parse(e.get(index ++)));
                gdp.setPiYoy(parse(e.get(index ++)));
                gdp.setSi(parse(e.get(index ++)));
                gdp.setSiYoy(parse(e.get(index ++)));
                gdp.setTi(parse(e.get(index ++)));
                gdp.setTiYou(parse(e.get(index ++)));

                gdpDao.merge(gdp);
            }
        }
    }

    double parse(Object o) {

        try {

            return Double.parseDouble(o.toString());
        } catch (Exception e) {
            return 0;
        }
    }
}
