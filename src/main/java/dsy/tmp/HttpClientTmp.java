package dsy.tmp;

import java.util.LinkedList;
import java.util.Queue;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-30
 */
public class HttpClientTmp {


    public static void pageCount() throws Exception {

        String url = "http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22zb%22%2C%22valuecode%22%3A%22A0B01%22%7D%5D&k1=1543298560493";

        String html = get(url, "UTF-8");

        System.out.println(html);
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
