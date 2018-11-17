package dsy.tmp;

import com.alibaba.fastjson.JSON;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-30
 */
public class HttpClientTmp {


    public static void rzrq() throws Exception {

        String html = get("http://data.eastmoney.com/zjlx/dpzjlx.html", "UTF-8");

        Pattern p = Pattern.compile("DefaultJson=\\[(.*)]");
        Matcher m = p.matcher(html);

        if(m.find()) {
            String s = m.group(1);
            System.out.println(s);
            System.out.println(JSON.parse(s));
        }
    }



    public static void main(String[] args) throws Exception {
        rzrq();
    }
}
