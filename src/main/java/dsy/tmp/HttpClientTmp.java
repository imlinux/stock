package dsy.tmp;

import com.alibaba.fastjson.JSON;

import java.util.Map;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-30
 */
public class HttpClientTmp {


    public static void rzrq() throws Exception {

        String json = get("http://data.stats.gov.cn/easyquery.htm?m=QueryData&dbcode=hgyd&rowcode=zb&colcode=sj&wds=%5B%5D&dfwds=%5B%7B%22wdcode%22%3A%22sj%22%2C%22valuecode%22%3A%222015%22%7D%5D&k1=1543226570023", "UTF-8");

        Map<String, Object> m = JSON.parseObject(json);

        System.out.println(m);
    }



    public static void main(String[] args) throws Exception {
        rzrq();
    }
}
