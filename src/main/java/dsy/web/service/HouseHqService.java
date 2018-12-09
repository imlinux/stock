package dsy.web.service;

import dsy.core.entity.HouseHq;
import dsy.web.dao.HouseHqDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static dsy.core.tools.HttpClientTool.get;
import static dsy.core.tools.Tool.pauseTime;

@Service
@Transactional
public class HouseHqService {
    private Log LOG = LogFactory.getLog(getClass());

    @Autowired
    private HouseHqDao houseHqDao;


    public void syncFromAnjuke() throws Exception {

        Queue<String> pageQueue = new LinkedList<>();
        pageQueue.add("https://hangzhou.anjuke.com/sale/p1/");

        while (true) {

            String pageUrl = pageQueue.poll();
            if(pageUrl == null) break;

            String html = get(pageUrl, "UTF-8");

            Document doc = Jsoup.parse(html);

            Element houseList = doc.getElementById("houselist-mod-new");
            Elements elements = houseList.getElementsByClass("house-title");

            for (Element e : elements) {
                Elements ee = e.getElementsByTag("a");
                if (ee.size() > 0) {

                    HouseHq houseHq = new HouseHq();

                    String houseDetailInfoUrl = ee.get(0).attr("href");
                    houseHq.setPageId(getPageId(houseDetailInfoUrl));
                    houseHq.setUrl(houseDetailInfoUrl);

                    try {
                        long t = pauseTime();
                        LOG.info("暂停" + t / 1000 + "秒钟 [" + houseDetailInfoUrl + "]");
                        Thread.sleep(t);
                    } catch (Exception ex) {
                        LOG.error(ex);
                    }

                    String detailInfoHtml = get(houseDetailInfoUrl, "UTF-8");

                    Document detailInfoDoc = Jsoup.parse(detailInfoHtml);


                    //房屋编码和发布日期
                    {
                        Element houseCode = detailInfoDoc.getElementById("houseCode");

                        String houseCodeText = houseCode.text().replace("房屋编码", "");
                        houseCodeText = houseCodeText.replace(":", "");
                        houseCodeText = houseCodeText.replace("：", "");
                        houseCodeText = houseCodeText.replace(",", "");
                        houseCodeText = houseCodeText.replace("，", "");
                        houseCodeText = houseCodeText.trim();

                        houseHq.setHouseCode(houseCodeText);

                        Elements houseEncode = detailInfoDoc.getElementsByClass("house-encode");

                        if (houseEncode.size() > 0) {
                            String text = houseEncode.first().ownText();
                            String publishDate = text.replace("发布时间", "");
                            publishDate = publishDate.replace(":", "");
                            publishDate = publishDate.replace("：", "");
                            publishDate = publishDate.trim();
                            houseHq.setPublishDate(publishDate);
                        }
                    }

                    {
                        Elements houseInfoItems = detailInfoDoc.getElementsByClass("houseInfo-detail-item");

                        for (Element item : houseInfoItems) {

                            String label = item.child(0).text().trim();
                            String content = item.child(1).text();
                            Element contentElement = item.child(1);

                            switch (label) {
                                case "所属小区：":
                                    houseHq.setCommunity(content);
                                    break;

                                case "房屋户型：":
                                    houseHq.setType(content);
                                    break;

                                case "房屋单价：":
                                    houseHq.setPrice(content);
                                    break;
                                case "所在位置：":
                                    houseHq.setLocation(content);

                                    houseHq.setCity("杭州市");
                                    houseHq.setQu(contentElement.child(0).child(0).ownText());
                                    houseHq.setJiedao(contentElement.child(0).child(1).ownText());
                                    break;
                                case "建筑面积：":
                                    houseHq.setArea(content);
                                    break;
                                case "建造年代：":
                                    houseHq.setAge(content);
                                    break;

                                case "房屋朝向：":
                                    houseHq.setOrientations(content);
                                    break;

                                case "房屋类型：":
                                    houseHq.setProperty(content);
                                    break;

                                case "所在楼层：":
                                    houseHq.setStorey(content);
                                    break;

                                case "装修程度：":
                                    houseHq.setDecorate(content);
                                    break;

                                case "产权年限：":
                                    houseHq.setProperyAge(content);
                                    break;

                                case "配套电梯：":
                                    houseHq.setLift(content);
                                    break;

                                case "房本年限：":
                                    houseHq.setFangBenAge(content);
                                    break;

                                case "产权性质：":
                                    houseHq.setChanQuanXingZhi(content);
                                    break;
                            }
                        }
                    }
                    houseHq.setId(houseHq.getPageId());
                    houseHqDao.merge(houseHq);
                }
            }

            Set<String> pages = new TreeSet<>();
            Elements multiPage = doc.getElementsByClass("multi-page");
            if (multiPage.size() >= 0) {
                Element e = multiPage.first();
                Elements ee = e.getElementsByTag("a");

                for (Element e1 : ee) {
                    pages.add(e1.attr("href"));
                }
            }
            //pageQueue.addAll(pages);
        }

    }

    String getPageId(String url) {
        Pattern p = Pattern.compile("view/(A.*)\\?");

        Matcher m = p.matcher(url);

        if(m.find()) {
            return m.group(1);
        }
        return "";
    }
}
