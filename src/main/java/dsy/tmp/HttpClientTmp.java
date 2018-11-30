package dsy.tmp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.ServerSocket;
import java.net.URL;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-30
 */
public class HttpClientTmp {


    public static void rzrq() throws Exception {

        String html = get("http://data.eastmoney.com/shibor/shibor.aspx?m=sh&t=99&d=99221&cu=cny&type=009016&p=1", "GBK");

        Document document = Jsoup.parse(html);

        Element element = document.getElementById("PageCont");

        Elements e = element.getElementsContainingOwnText("尾页");
        System.out.println(e.attr("href"));
        ///shibor/shibor.aspx?m=sh&t=99&d=99221&cu=cny&type=009016&p=152
    }



    public static void main(String[] args) throws Exception {
        rzrq();
    }
}
