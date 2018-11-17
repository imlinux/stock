package dsy.tmp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-30
 */
public class HttpClientTmp {


    public static void rzrq() throws Exception {

        String json = get("http://data.eastmoney.com/zjlx/dpzjlx.html", "UTF-8");

        Pattern p = Pattern.compile("var Dataphqs=(.*);");
        Matcher m = p.matcher(json);

        if(m.find())
            System.out.println(m.group(1));
    }



    public static void main(String[] args) throws Exception {
        rzrq();
    }
}
