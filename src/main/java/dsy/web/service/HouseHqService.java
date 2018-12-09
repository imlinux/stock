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
import org.springframework.transaction.support.TransactionTemplate;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static dsy.core.tools.HttpClientTool.get;
import static dsy.core.tools.Tool.pauseTime;

@Service
public class HouseHqService {
    private Log LOG = LogFactory.getLog(getClass());

    @Autowired
    private TransactionTemplate transactionTemplate;
    @Autowired
    private HouseHqDao houseHqDao;

    public void syncOnePageFromAnjuke(Document pageDoc) throws Exception {

        Element houseList = pageDoc.getElementById("houselist-mod-new");
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
    }


    public void syncFromAnjuke() throws Exception {

        Queue<String> pageQueue = new LinkedList<>();
        pageQueue.add("https://hangzhou.anjuke.com/sale/p1/");

        while (true) {

            String pageUrl = pageQueue.poll();
            if(pageUrl == null) break;

            int currentPageNum = getPageNum(pageUrl);
            LOG.info("开始同步页面:" + currentPageNum + "-->" + pageUrl);
            String html = get(pageUrl, "UTF-8");

            Document doc = Jsoup.parse(html);

            doInTransaction(doc);

            Set<String> pages = new TreeSet<>();
            Set<String> pagesSet = new HashSet<>(pageQueue);
            Elements multiPage = doc.getElementsByClass("multi-page");
            if (multiPage.size() >= 0) {
                Element e = multiPage.first();
                Elements ee = e.getElementsByTag("a");

                for (Element e1 : ee) {
                    String url = e1.attr("href");
                    int pageNumber = getPageNum(url);

                    if(pageNumber > currentPageNum && !pagesSet.contains(url)) pages.add(url);
                }
            }
            LOG.info("添加页面:" + pages);
            pageQueue.addAll(pages);
            LOG.info("页面队列" + pageQueue);
        }

    }

    public void doInTransaction(Document doc) {

        transactionTemplate.execute(status -> {
            try {
                syncOnePageFromAnjuke(doc);
            } catch (Exception e) {
                LOG.error(e);
            }
            return null;
        });
    }
    String getPageId(String url) {
        Pattern p = Pattern.compile("view/(A.*)\\?");

        Matcher m = p.matcher(url);

        if(m.find()) {
            return m.group(1);
        } else {
            LOG.warn("未获取详情页面id");
            return "";
        }
    }

    int getPageNum(String pageUrl) {
        Pattern p = Pattern.compile("/p(\\d+)/");

        Matcher m = p.matcher(pageUrl);

        if(m.find()) {
            String text = m.group(1);

            return Integer.parseInt(text);
        } else {
            LOG.warn("未获取页面号");
            return 0;
        }
    }
}
