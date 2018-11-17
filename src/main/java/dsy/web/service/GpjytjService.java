package dsy.web.service;

import dsy.core.entity.Gdp;
import dsy.core.entity.GpJyTj;
import dsy.web.dao.GpjytjDao;
import dsy.web.dto.BuffettRationTo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-11-17
 */
@Service
@Transactional
public class GpjytjService {

    @Autowired
    private GpjytjDao gpjytjDao;

    @Autowired
    private GdpService gdpService;

    public void syncGpJytjFromEastMoney() throws Exception {

        String html = get("http://data.eastmoney.com/cjsj/gpjytj.html", "GBK");

        Document d = Jsoup.parse(html);

        Element tbody = d.select(".data_region table").first();

        Elements trs = tbody.select("tr");

        for(Element tr: trs) {

            Elements es = tr.select("td");

            if(es.size() == 0) continue;


            GpJyTj gpJyTjSH = new GpJyTj();

            GpJyTj gpJyTjSZ = new GpJyTj();

            gpJyTjSH.setMkt("SH");
            gpJyTjSZ.setMkt("SZ");

            int index = 0;

            String date = es.get(index ++).text();

            if(date.contains("年累计")) continue;

            gpJyTjSH.setDate(date);
            gpJyTjSZ.setDate(date);

            index ++;
            index ++;

            gpJyTjSH.setMktVal(parseDouble(es.get(index ++).text()));
            gpJyTjSZ.setMktVal(parseDouble(es.get(index ++).text()));

            gpJyTjSH.setTurnoverValue(parseDouble(es.get(index ++).text()));
            gpJyTjSZ.setTurnoverValue(parseDouble(es.get(index ++).text()));

            gpJyTjSH.setTurnoverVolume(parseDouble(es.get(index ++).text()));
            gpJyTjSZ.setTurnoverVolume(parseDouble(es.get(index ++).text()));

            gpJyTjSH.setId(gpJyTjSH.getDate() + gpJyTjSH.getMkt());
            gpJyTjSZ.setId(gpJyTjSZ.getDate() + gpJyTjSZ.getMkt());

            gpjytjDao.merge(gpJyTjSH);
            gpjytjDao.merge(gpJyTjSZ);
        }
    }

    public List<BuffettRationTo> buffettRatio() {
        Gdp gdp = gdpService.getLatest();

        List<BuffettRationTo> l = gpjytjDao.buffettRatio();

        for(BuffettRationTo e: l) {

            double g;

            if(e.getGdp() == 0) g = gdp.getGdp();
            else g = e.getGdp();

            e.setMktValGdp(e.getMktVal() / g); //百分比
        }

        return l;
    }

    private Double parseDouble(String d) {

        try {
            return Double.parseDouble(d);
        } catch (Exception e) {
            return 0.0;
        }
    }
}
