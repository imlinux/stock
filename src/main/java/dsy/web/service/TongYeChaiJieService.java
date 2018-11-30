package dsy.web.service;

import dsy.core.entity.TongYeChaiJie;
import dsy.web.dao.TongYeChaiJieDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.TruncatedChunkException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.function.BiConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-11-30
 */
@Service
@Transactional
public class TongYeChaiJieService {

    private Log LOG = LogFactory.getLog(getClass());

    @Autowired
    private TongYeChaiJieDao tongYeChaiJieDao;

    public void syncLatestFromEastMoney() throws Exception {
        syncAllDataFromEastMoney(1);
    }

    public void syncAllDataFromEastMoney(int pageCount) throws Exception {


        if(pageCount <= 0)
        //获取页数
        {
            String html = get("http://data.eastmoney.com/shibor/shibor.aspx?m=sh&t=99&d=99221&cu=cny&type=009016&p=", "GBK");
            Element element = Jsoup.parse(html).getElementById("PageCont");

            Elements e = element.getElementsContainingOwnText("尾页");

            assert e.size() == 1;

            String url = e.get(0).attr("href");

            Pattern pattern = Pattern.compile("&p=(\\d+)");
            Matcher m = pattern.matcher(url);

            if(m.find()) {
                pageCount = Integer.parseInt(m.group(1));
            }
        }


        for(int i = 1; i <= pageCount; i++) {

            Elements gy =   getTrs("http://data.eastmoney.com/shibor/shibor.aspx?m=sh&t=99&d=99221&cu=cny&type=009016&p=" + i);
            Elements oneW = getTrs("http://data.eastmoney.com/shibor/shibor.aspx?m=sh&t=99&d=99222&cu=cny&type=009017&p=" + i);
            Elements twoW = getTrs("http://data.eastmoney.com/shibor/shibor.aspx?m=sh&t=99&d=99223&cu=cny&type=009018&p=" + i);
            Elements oneM = getTrs("http://data.eastmoney.com/shibor/shibor.aspx?m=sh&t=99&d=99224&cu=cny&type=009019&p=" + i);
            Elements threeM = getTrs("http://data.eastmoney.com/shibor/shibor.aspx?m=sh&t=99&d=99225&cu=cny&type=009020&p=" + i);
            Elements sixM = getTrs("http://data.eastmoney.com/shibor/shibor.aspx?m=sh&t=99&d=99226&cu=cny&type=009021&p=" + i);
            Elements nineM = getTrs("http://data.eastmoney.com/shibor/shibor.aspx?m=sh&t=99&d=99227&cu=cny&type=009022&p=" + i);
            Elements oneYear = getTrs("http://data.eastmoney.com/shibor/shibor.aspx?m=sh&t=99&d=99228&cu=cny&type=009023&p=" + i);

            String type = "shibor";

            setTongYeChaiJie(gy, type, (o, v) -> o.setGylv(v), (o, v) -> o.setGyBp(v));
            setTongYeChaiJie(oneW, type, (o, v) -> o.setOneWeekLv(v), (o, v) -> o.setOneWeekBp(v));
            setTongYeChaiJie(twoW, type, (o, v) -> o.setTwoWeekLv(v), (o, v) -> o.setTwoWeekBp(v));
            setTongYeChaiJie(oneM, type, (o, v) -> o.setOneMonthLv(v), (o, v) -> o.setOneMonthBp(v));
            setTongYeChaiJie(threeM, type, (o, v) -> o.setThreeMonthLv(v), (o, v) -> o.setThreeMonthBp(v));
            setTongYeChaiJie(sixM, type, (o, v) -> o.setSixMonthLv(v), (o, v) -> o.setThreeMonthBp(v));
            setTongYeChaiJie(nineM, type, (o, v) -> o.setNineMonthLv(v), (o, v) -> o.setNineMonthBp(v));
            setTongYeChaiJie(oneYear, type, (o, v) -> o.setOneYearLv(v), (o, v) -> o.setOneYearBp(v));
        }
    }

    Elements getTrs(String url) throws Exception {
        int count = 3;

        while (true) {
            try {
                String html = get(url, "GBK");
                Document document = Jsoup.parse(html);

                return document.select("tr");
            } catch (TruncatedChunkException e) {
                LOG.error("还剩 " + count + "次", e);
                if(count <= 0) throw e;

                count --;
            }
        }
    }


    void setTongYeChaiJie(Elements elements, String type, BiConsumer<TongYeChaiJie, Double> lvMethod,
                          BiConsumer<TongYeChaiJie, Double> bpMethod) throws Exception {

        for (Element e : elements) {

            if ("firstTr".equals(e.className())) continue;

            String date = e.child(0).text();
            double lv = parse(e.child(1).text());
            double bp = parse(e.child(2).text());

            String id = type + date;

            TongYeChaiJie tongYeChaiJie = tongYeChaiJieDao.find(TongYeChaiJie.class, id);

            if(tongYeChaiJie == null) {
                tongYeChaiJie = new TongYeChaiJie();
                tongYeChaiJie.setId(id);
                tongYeChaiJie.setType(type);
                tongYeChaiJie.setDate(date);

                tongYeChaiJieDao.persist(tongYeChaiJie);
            }

            lvMethod.accept(tongYeChaiJie, lv);
            bpMethod.accept(tongYeChaiJie, bp);


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
