package dsy.tmp;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.CompanyHQ;
import dsy.core.entity.Lrb;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-30
 */
public class HttpClientTmp {

    public static void get_today_all() throws Exception {

        String url = "http://vip.stock.finance.sina.com.cn/quotes_service/api/json_v2.php/Market_Center.getHQNodeData?page=1&num=40&sort=amount&asc=0&node=hs_a&symbol=&_s_r_a=page";

        String s = get(url, "GBK");

        List<CompanyHQ> ret = JSON.parseArray(s, CompanyHQ.class);

        System.out.println(ret.get(0));
    }


    //新浪板块汇总
    //http://vip.stock.finance.sina.com.cn/mkt/#bkhq
    public static void sina_sw() throws Exception {

        String url = "http://vip.stock.finance.sina.com.cn/q/view/SwHy.php";

        String s = get(url, "GBK");

        int i = s.indexOf("{");

        s = s.substring(i);

        System.out.println(JSON.parse(s));
    }

    /**
     * 华尔街见闻行情
     * @throws Exception
     */
    public static void wallstreetcn() throws Exception {
        String url = "https://api-ddc.wallstreetcn.com/market/rank?market_type=mdc&stk_type=stock&order_by=none&sort_field=px_change_rate&limit=5000&fields=prod_name,prod_en_name,prod_code,symbol,last_px,px_change,px_change_rate,high_px,low_px,week_52_high,week_52_low,price_precision,update_time&cursor=1";

    }


    public static void jiari() throws Exception {
        String url = "http://tool.bitefu.net/jiari/?d=20181103&info=1&back=json";
        System.out.println(get(url, "UTF-8"));
    }


    public static void rzrq() throws Exception {
        String s = "2003%2F12%2F31+0%3A00%3A00";

        System.out.println(URLDecoder.decode(s));
    }



    public static void main(String[] args) throws Exception {
        rzrq();
    }
}
