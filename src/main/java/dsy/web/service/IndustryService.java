package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.IndustryHQ;
import dsy.web.dao.IndustryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static dsy.core.tools.DateTool.getDayStr;
import static dsy.core.tools.HttpClientTool.get;
import static dsy.core.tools.TradeTool.getLatestTrade;
/**
 * @author dong
 * @since 18-11-1
 */
@Service
@Transactional
public class IndustryService {

    @Autowired
    private IndustryDao industryDao;

    public void syncFromEasyMoneyIndustry() throws Exception {

        String html = get("http://nufm.dfcfw.com/EM_Finance2014NumericApplication/JS.aspx?type=CT&token=4f1862fc3b5e77c150a2b985b12db0fd&sty=FPGBKI&cmd=C._BKHY", "UTF-8");

        String latestTradeDate = getDayStr(getLatestTrade());

        String json = html.replace("(", "");
        json = json.replace(")", "");


        List<Object> data = JSON.parseArray(json);

        for(Object e: data) {

            String rec = (String) e;

            String[] value = rec.split(",");
            int index = 0;

            index++;

            IndustryHQ industryHQ = new IndustryHQ();

            industryHQ.setCode(value[index ++]);
            industryHQ.setSymbol(value[index ++]);
            industryHQ.setChangePercent(parseDouble(value[index ++]));
            industryHQ.setMarketValue(parseDouble(value[index ++]));
            industryHQ.setTurnoverRatio(parseDouble(value[index ++]));


            industryHQ.setDate(latestTradeDate);
            industryHQ.setId(industryHQ.getCode() + "_" + latestTradeDate);
            industryDao.save(industryHQ);
        }

    }


    public List<IndustryHQ> getAllIndustryHq(String date) {
        return industryDao.findByDate(date);
    }

    public List<IndustryHQ> getAllIndustryHq() {
        return getAllIndustryHq(industryDao.getLatestTradeDate());
    }

    double parseDouble(Object d) {

        try {
            return Double.parseDouble(d.toString());
        } catch (Exception e) {
            return 0.0;
        }
    }
}
