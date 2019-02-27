package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.CapitalFlow;
import dsy.core.entity.HSGTCapitalFlow;
import dsy.web.dao.CapitalFlowDao;
import dsy.web.dao.HSGTCapotalFlowDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

import static dsy.core.tools.DateTool.getDayStr;
import static dsy.core.tools.HttpClientTool.get;
import static dsy.core.tools.TradeTool.getLatestTrade;

/**
 * @author dong
 * @since 18-11-16
 *
 * 资金流
 */
@Service
@Transactional
public class CapitalFlowService {

    @Autowired
    private CapitalFlowDao capitalFlowDao;

    @Autowired
    private HSGTCapotalFlowDao hsgtCapotalFlowDao;

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
            capitalFlowDao.save(capitalFlow);
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
            capitalFlowDao.save(capitalFlow);
        }
    }


    double parseDouble(String o) {

        try {
            return Double.parseDouble(o);
        } catch (Exception e) {
            return 0;
        }
    }


    /**
     * 获取个股每天资金流
     * @param code
     * @return
     * @throws Exception
     */
    public List<CapitalFlow> getCompanyCapitalFlow(String code) throws Exception {

        Sort sort = Sort.by("date").ascending();
        List<CapitalFlow> ret = capitalFlowDao.findByCode(code, sort);

        if(ret.isEmpty()) {
            syncCompanyCapitalFlowFromEastMoney(code);
            ret = capitalFlowDao.findByCode(code, sort);
        }
        return ret;
    }


    @Scheduled(fixedDelay = 10 * 60 * 1000)
    public void syncHSGTCaptialFlow() throws Exception {

        String url = "http://dcfm.eastmoney.com/EM_MutiSvcExpandInterface/api/js/get?type=HSGTZJZS&token=70f12f2f4f091e459a279469fe49eca5";

        String jsonString = get(url, "UTF-8");

        List l = JSON.parseArray(jsonString);

        l.forEach( e -> {

            Map<String, Object> rec = (Map) e;

            HSGTCapitalFlow hsgtCapitalFlow = new HSGTCapitalFlow();

            hsgtCapitalFlow.setDateTime(rec.get("DateTime").toString());
            hsgtCapitalFlow.setHsMoney(parseDouble(rec.get("HSMoney").toString()));
            hsgtCapitalFlow.setSsMoney(parseDouble(rec.get("SSMoney").toString()));
            hsgtCapitalFlow.setNorthMoney(parseDouble(rec.get("NorthMoney").toString()));
            hsgtCapitalFlow.setGghsMoney(parseDouble(rec.get("GGHSMoney").toString()));
            hsgtCapitalFlow.setGgssMoney(parseDouble(rec.get("GGSSMoney").toString()));
            hsgtCapitalFlow.setSsMoney(parseDouble(rec.get("SouthSumMoney").toString()));

            hsgtCapitalFlow.setId(hsgtCapitalFlow.getDateTime());
            hsgtCapotalFlowDao.save(hsgtCapitalFlow);
        });

    }

}
