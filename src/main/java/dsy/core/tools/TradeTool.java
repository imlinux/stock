package dsy.core.tools;

import java.util.Calendar;
import java.util.Date;

import static dsy.core.tools.DateTool.getDay;
import static dsy.core.tools.DateTool.getDayStr;
import static dsy.core.tools.HttpClientTool.get;

/**
 * @author dong
 * @since 18-11-2
 */
public class TradeTool {


    public static Date getLatestTrade() throws Exception {

        Calendar calendar = Calendar.getInstance();

        int retry = 10;
        while (true) {
            if(retry < 0) throw new Exception("超过尝试次数");
            String currentDayStr = getDayStr(calendar.getTime(), "yyyyMMdd");

            String url = "http://tool.bitefu.net/jiari/?d=" + currentDayStr;

            String ret = get(url, "UTF-8");

            if("0".equals(ret)) {
                Date date = calendar.getTime();
                return getDay(date);

            } else {
                calendar.add(Calendar.DAY_OF_MONTH, -1);
                retry --;
            }
        }
    }

    public static String getLatestTradeStr() throws Exception {
        return getDayStr(getLatestTrade());
    }
}
