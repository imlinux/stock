package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.EastMoneyRzRqDetial;
import dsy.core.entity.EastMoneyRzrq;
import dsy.web.dao.RzRqDao;
import dsy.web.dto.HSMargin;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static dsy.core.tools.DateTool.getDayStr;
import static dsy.core.tools.HttpClientTool.get;
import static dsy.core.tools.StringTool.isEmpty;
import static dsy.core.tools.TradeTool.getLatestTrade;

/**
 * @author dong
 * @since 18-11-2
 */
@Service
@Transactional
public class RzRqService {

    @Autowired
    private RzRqDao rzRqDao;

    public void syncFromEastMoneyDetialByDay(Date date) throws Exception {

        String tradeDateStr = getDayStr(date);

        String url = "http://dcfm.eastmoney.com/em_mutisvcexpandinterface/api/js/get?type=RZRQ_DETAIL_NJ&token=70f12f2f4f091e459a279469fe49eca5&st=rzjmre&sr=-1";

        url += "&filter=(tdate=%27" + tradeDateStr +"T00:00:00%27)";

        String json = get(url, "UTF-8");

        List ret = JSON.parseArray(json);

        for(Object o: ret) {

            Map<String, Object> e = (Map) o;

            EastMoneyRzRqDetial rec = new EastMoneyRzRqDetial();

            rec.setId(tradeDateStr + e.get("scode"));
            rec.setDate(new java.sql.Date(date.getTime()));

            rec.setScode((String) e.get("scode"));
            rec.setSname((String) e.get("sname"));
            rec.setHfqjg(parse(e.get("hfqjg")));
            rec.setMarket((String) e.get("market"));
            rec.setClose(parse(e.get("close")));
            rec.setZdf(parse(e.get("zdf")));
            rec.setZdf3(parse(e.get("zdf3")));
            rec.setZdf5(parse(e.get("zdf5")));
            rec.setZdf10(parse(e.get("zdf10")));
            rec.setAGSZBHXS(parse(e.get("AGSZBHXS")));
            rec.setRzye(parse(e.get("rzye")));
            rec.setRzyezb(parse(e.get("rzyezb")));
            rec.setRzmre(parse(e.get("rzmre")));
            rec.setRzmre3(parse(e.get("rzmre3")));
            rec.setRzmre5(parse(e.get("rzmre5")));
            rec.setRzmre10(parse(e.get("rzmre10")));
            rec.setRzche(parse(e.get("rzche")));
            rec.setRzche3(parse(e.get("rzche3")));
            rec.setRzche5(parse(e.get("rzche5")));
            rec.setRzche10(parse(e.get("rzche10")));
            rec.setRzjmre(parse(e.get("rzjmre")));
            rec.setRzjmre3(parse(e.get("rzjmre3")));
            rec.setRzjmre5(parse(e.get("rzjmre5")));
            rec.setRzjmre10(parse(e.get("rzjmre10")));
            rec.setRqye(parse(e.get("rqye")));
            rec.setRqyl(parse(e.get("rqyl")));
            rec.setRqmcl(parse(e.get("rqmcl")));
            rec.setRqmcl3(parse(e.get("rqmcl3")));
            rec.setRqmcl5(parse(e.get("rqmcl5")));
            rec.setRqmcl10(parse(e.get("rqmcl10")));
            rec.setRqchl(parse(e.get("rqchl")));
            rec.setRqchl3(parse(e.get("rqchl3")));
            rec.setRqchl5(parse(e.get("rqchl5")));
            rec.setRqchl10(parse(e.get("rqchl10")));
            rec.setRqjmcl(parse(e.get("rqjmcl")));
            rec.setRqjmcl3(parse(e.get("rqjmcl3")));
            rec.setRqjmcl5(parse(e.get("rqjmcl5")));
            rec.setRqjmcl10(parse(e.get("rqjmcl10")));
            rec.setRzrqye(parse(e.get("rzrqye")));
            rec.setRzrqyecz(parse(e.get("rzrqyecz")));

            rzRqDao.merge(rec);
        }

    }

    public void syncFromEastMoneyDetial(Date start, Date end) throws Exception {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);

        while (true) {
            if(end.getTime() < calendar.getTimeInMillis()) return;


            syncFromEastMoneyDetialByDay(calendar.getTime());

            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
    }

    public void syncFromEastMoneyDetial() throws Exception {

        Calendar calendar = Calendar.getInstance();
        Date tradeDate = getLatestTrade();

        calendar.setTime(tradeDate);
        calendar.add(Calendar.DAY_OF_MONTH, -1);//前一个交易日



        syncFromEastMoneyDetialByDay(calendar.getTime());
    }


    /**
     *
     * @param updateAll 是否同步历史数据
     * @throws Exception
     */
    public void syncRzrqFromEastMoney(boolean updateAll) throws Exception {

        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        String url = "http://dcfm.eastmoney.com//EM_MutiSvcExpandInterface/api/js/get?token=70f12f2f4f091e459a279469fe49eca5&st=tdate&sr=-1&type=RZRQ_LSTOTAL_NJ&mk_time=1&rt=51380452";

        if(updateAll) {
            url += "&p=1&ps=6000";
        }

        String json = get(url, "UTF-8");

        List ret = JSON.parseArray(json);

        for(Object o: ret) {

            Map<String, Object> e = (Map) o;

            for (Map.Entry<String, Object> ee : e.entrySet()) {
                if (isEmpty(ee.getValue()) || ee.getValue().equals("-")) {
                    ee.setValue("0");
                }
            }

            EastMoneyRzrq eastMoneyRzrq = new EastMoneyRzrq();

            BeanWrapper beanWrapper = new BeanWrapperImpl(eastMoneyRzrq);
            beanWrapper.setPropertyValues(new MutablePropertyValues(e));


            eastMoneyRzrq.setDate(new java.sql.Date(sm.parse(eastMoneyRzrq.getTdate()).getTime()));
            eastMoneyRzrq.setId(eastMoneyRzrq.getTdate());

            rzRqDao.merge(eastMoneyRzrq);
        }
    }


    public List<HSMargin> getRzRq() {
        List<HSMargin> l = rzRqDao.findAll();

        return l;
    }


    private static Double parse(Object s) {

        try {
            return Double.parseDouble(s.toString());
        } catch (Exception e) {
            return 0.0;
        }
    }
}
