package dsy.tmp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.LinkedList;
import java.util.Queue;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-30
 */
public class HttpClientTmp {


    public static void pageCount() throws Exception {

        String url = "https://hz.zu.anjuke.com/fangyuan/1246915268";
        String html = get(url, "UTF-8");

        Document document = Jsoup.parse(html);
        Elements zuItems = document.getElementsByClass("multi-page");

        if(zuItems.size() > 0) {
            Element e = zuItems.first();

            Elements elements = e.getElementsByTag("a");

            elements.forEach(ele -> {
                System.out.println(ele.attr("href"));
            });
        }
    }


    public static void rzrq() throws Exception {

        Queue<String> pageQueue = new LinkedList<>();
        pageQueue.add("https://hz.zu.anjuke.com/fangyuan/p1/");

        while (true) {
            String pageUrl = pageQueue.poll();

            if(pageUrl == null) break;


        }
    }



    public static void main(String[] args) throws Exception {
        pageCount();
    }
}
