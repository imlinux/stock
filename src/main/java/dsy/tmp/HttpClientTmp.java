package dsy.tmp;

import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-10-30
 */
public class HttpClientTmp {


    public static void rzrq() throws Exception {

        String s = "https://api-ddc.wallstreetcn.com/market/kline?period_type=86400&tick_count=256&fields=tick_at,open_px,close_px,high_px,low_px,turnover_volume,turnover_value,average_px,px_change,px_change_rate,avg_px,ma2&prod_code=DE10YR.OTC";

        String jsonText = get(s, "UTF-8");
        Map<String, Object> jsonObj = JSON.parseObject(jsonText);

        List l = (List) ((Map) jsonObj.get("data")).get("fields");

        System.out.println(l);

    }



    public static void main(String[] args) throws Exception {
        rzrq();
    }
}
