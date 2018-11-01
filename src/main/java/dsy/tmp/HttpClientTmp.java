package dsy.tmp;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.CompanyHQ;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.Date;
import java.util.List;

/**
 * @author dong
 * @since 18-10-30
 */
public class HttpClientTmp {

    public static void get_today_all() throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("http://vip.stock.finance.sina.com.cn/quotes_service/api/json_v2.php/Market_Center.getHQNodeData?page=1&num=40&sort=amount&asc=0&node=hs_a&symbol=&_s_r_a=page");

        CloseableHttpResponse response1 = httpclient.execute(httpGet);

        try {
            System.out.println(response1.getStatusLine());
            HttpEntity entity1 = response1.getEntity();

            String s = IOUtils.toString(entity1.getContent(), "GBK");

            List<CompanyHQ> ret = JSON.parseArray(s, CompanyHQ.class);

            System.out.println(ret.get(0));
        } finally {
            response1.close();
        }
    }


    //新浪板块汇总
    //http://vip.stock.finance.sina.com.cn/mkt/#bkhq
    public static void sina_sw() throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("http://vip.stock.finance.sina.com.cn/q/view/SwHy.php"); //申万行业

        CloseableHttpResponse response = httpClient.execute(httpGet);

        try {
            HttpEntity entity1 = response.getEntity();

            String s = IOUtils.toString(entity1.getContent(), "GBK");

            int i = s.indexOf("{");

            s = s.substring(i);

            System.out.println(JSON.parse(s));
        } finally {
            response.close();
        }
    }

    /**
     * 华尔街见闻行情
     * @throws Exception
     */
    public static void wallstreetcn() throws Exception {
        HttpGet httpGet = new HttpGet("https://api-ddc.wallstreetcn.com/market/rank?market_type=mdc&stk_type=stock&order_by=none&sort_field=px_change_rate&limit=5000&fields=prod_name,prod_en_name,prod_code,symbol,last_px,px_change,px_change_rate,high_px,low_px,week_52_high,week_52_low,price_precision,update_time&cursor=1");

    }



    public static void main(String[] args) throws Exception {
         System.out.println(Double.parseDouble("7.516339869281046"));
    }
}
