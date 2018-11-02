package dsy.tmp;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.CompanyHQ;
import org.apache.http.client.methods.HttpGet;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

//        String url = "http://dcfm.eastmoney.com/em_mutisvcexpandinterface/api/js/get?type=RZRQ_DETAIL_NJ&token=70f12f2f4f091e459a279469fe49eca5&st=rzjmre&sr=-1&p=1&ps=50";
//
//        url += "&filter=(tdate=%272018-11-01T00:00:00%27)";
//
//        System.out.println(get(url, "UTF-8"));

        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(sm.parse("2018-11-01").getTime());

    }



    public static void main(String[] args) throws Exception {
        rzrq();
    }
}
