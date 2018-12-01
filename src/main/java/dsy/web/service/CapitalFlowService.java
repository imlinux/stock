package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.CapitalFlow;
import dsy.web.dao.CapitalFlowDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static dsy.core.tools.DateTool.getDayStr;
import static dsy.core.tools.HttpClientTool.get;
import static dsy.core.tools.TradeTool.getLatestTrade;

/**
 * @author dong
 * @since 18-11-16
 */
@Service
@Transactional
public class CapitalFlowService {

    @Autowired
    private CapitalFlowDao capitalFlowDao;

    /**
     * 同步公司的资金流
     * @param code
     * @throws Exception
     */
    public void syncCompanyCapitalFlowFromEastMoney(String code) throws Exception {

        int dotIndex = code.indexOf(".");

        String prefix = code.substring(0, dotIndex);
        String suffix = code.substring(dotIndex);



        String formatCode = prefix  + (suffix.equals(".SH")? "1": "2");
        String url = "http://ff.eastmoney.com//EM_CapitalFlowInterface/api/js?type=hff&rtntype=2&acces_token=1942f5da9b46b069953c873404aad4b5&id=" + formatCode;
        String json = get(url, "UTF-8");

        json = json.replace("(", "").replace(")", "");

        List l = JSON.parseArray(json);

        for(Object o : l) {

            String[] e = o.toString().split(",");

            int index = 0;

            CapitalFlow capitalFlow = new CapitalFlow();

            capitalFlow.setDate(e[index ++]);
            capitalFlow.setZllr(parseDouble(e[index ++]));
            capitalFlow.setZllc(parseDouble(e[index ++]));
            capitalFlow.setZlje(parseDouble(e[index ++]));

            index++;

            capitalFlow.setCddlr(parseDouble(e[index ++]));
            capitalFlow.setCddlc(parseDouble(e[index ++]));
            capitalFlow.setCddje(parseDouble(e[index ++]));

            index++;

            capitalFlow.setDdlr(parseDouble(e[index ++]));
            capitalFlow.setDdlc(parseDouble(e[index ++]));
            capitalFlow.setDdje(parseDouble(e[index ++]));

            index++;

            capitalFlow.setZdlr(parseDouble(e[index ++]));
            capitalFlow.setZdlc(parseDouble(e[index ++]));
            capitalFlow.setZdje(parseDouble(e[index ++]));

            index++;

            capitalFlow.setXdlr(parseDouble(e[index ++]));
            capitalFlow.setXdlc(parseDouble(e[index ++]));
            capitalFlow.setXdje(parseDouble(e[index ++]));

            capitalFlow.setCode(code);
            capitalFlow.setId(capitalFlow.getCode() + capitalFlow.getDate());
            capitalFlowDao.merge(capitalFlow);
        }
    }


    /**
     * http://data.eastmoney.com/bkzj/
     * @throws Exception
     */
    public void syncIndustryCapitalFlowFromEastMoney() throws Exception {

        String url = "http://nufm.dfcfw.com/EM_Finance2014NumericApplication/JS.aspx?cmd=C._BKHY&type=ct&st=(BalFlowMain)&sr=-1&p=1&ps=100&token=894050c76af8597a853f5b408b759f5d&sty=DCFFITABK&rt=51414321";

        String json = get(url, "UTF-8");

        json = json.replace("(", "").replace(")", "");

        List l = JSON.parseArray(json);

        for(Object o : l) {

            String[] e = o.toString().split(",");

            int index = 1;

            CapitalFlow capitalFlow = new CapitalFlow();

            capitalFlow.setDate(getDayStr(getLatestTrade()));
            capitalFlow.setCode(e[index ++]);
            capitalFlow.setName(e[index ++]);


            capitalFlow.setZdf(parseDouble(e[index ++]));

            capitalFlow.setZlje(parseDouble(e[index ++]));

            index++;

            capitalFlow.setCddje(parseDouble(e[index ++]));

            index++;

            capitalFlow.setDdje(parseDouble(e[index ++]));

            index++;

            capitalFlow.setZdje(parseDouble(e[index ++]));

            index++;

            capitalFlow.setXdje(parseDouble(e[index ++]));


            capitalFlow.setId(capitalFlow.getCode() + capitalFlow.getDate());
            capitalFlowDao.merge(capitalFlow);
        }
    }


    double parseDouble(String o) {

        try {
            return Double.parseDouble(o);
        } catch (Exception e) {
            return 0;
        }
    }


    public List<CapitalFlow> getAllCompanyCapitalFlow(String code) throws Exception {

        List<CapitalFlow> ret = capitalFlowDao.getCompanyAllCapitalFlow(code);

        if(ret.isEmpty()) {
            syncCompanyCapitalFlowFromEastMoney(code);
            ret = capitalFlowDao.getCompanyAllCapitalFlow(code);
        }
        return ret;
    }
}
