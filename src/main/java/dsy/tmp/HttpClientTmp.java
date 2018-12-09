package dsy.tmp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.ServerSocket;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-30
 */
public class HttpClientTmp {


    public static void rzrq() throws Exception {

        String s = "https://hangzhou.anjuke.com/sale/p111111/";

        Pattern p = Pattern.compile("/p(\\d+)/");

        Matcher m = p.matcher(s);

        if(m.find())
        System.out.println(m.group(1));
    }



    public static void main(String[] args) throws Exception {
        rzrq();
    }
}
