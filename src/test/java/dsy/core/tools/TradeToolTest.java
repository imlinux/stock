package dsy.core.tools;

import org.junit.Test;

import static dsy.core.tools.DateTool.getDayStr;
import static org.junit.Assert.*;

/**
 * @author dong
 * @since 18-11-2
 */
public class TradeToolTest {


    @Test
    public void getLatestTrade() throws Exception {

        System.out.println(getDayStr(TradeTool.getLatestTrade()));
    }
}
