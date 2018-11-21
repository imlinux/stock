package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.Cwzb;
import dsy.core.entity.Lrb;
import dsy.core.entity.Xjllb;
import dsy.core.entity.Zcfzb;
import dsy.web.dao.FinanceDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.Jsoup;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import static dsy.core.tools.HttpClientTool.get;
import static dsy.core.tools.StringTool.isEmpty;

/**
 * @author dong
 * @since 18-11-3
 */
@Service
@Transactional
public class FinanceAnalysisService {

    private Log LOG = LogFactory.getLog(getClass());

    @Autowired
    private FinanceDao financeDao;

    public String getCompanytype(String code) throws Exception {
        String html = get("http://emweb.securities.eastmoney.com/f10_v2/FinanceAnalysis.aspx?type=web&code=" + code, "UTF-8");

        String ctype = Jsoup.parse(html).getElementById("hidctype").attr("value");

        return ctype;
    }

    /**
     * 同步利润表
     * @param code
     * @throws Exception
     */
    public void syncLrbFromEastMoney(String code, String endDate) throws Exception {

        String ctype = getCompanytype(code);

        SimpleDateFormat sm = new SimpleDateFormat("yyyy/MM/dd H:mm:ss");
        String[] urls = {
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/lrbAjax?companyType=" + ctype + "&reportDateType=0&reportType=1&code=" + code + "&endDate=",  //按报告期和报告期同比
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/lrbAjax?companyType=" + ctype + "&reportDateType=0&reportType=2&code=" + code + "&endDate=" //按单季度和按季度环比
        };

        if(! isEmpty(endDate)) {
            for(int i = 0; i < urls.length; i++) {
                urls[i] += endDate;
            }
        }
        for(String url: urls) {
            String json = get(url, "UTF-8");

            json = JSON.parse(json).toString();
            List ret = JSON.parseArray(json);

            for (Object o : ret) {
                Map<String, Object> e = (Map) o;

                for (Map.Entry<String, Object> ee : e.entrySet()) {
                    if (isEmpty(ee.getValue())) {
                        ee.setValue("0");
                    }
                }

                Lrb lrb = new Lrb();
                BeanWrapper beanWrapper = new BeanWrapperImpl(lrb);

                beanWrapper.setPropertyValues(new MutablePropertyValues(e));

                lrb.setDate(new java.sql.Date(sm.parse(lrb.getREPORTDATE()).getTime()));
                lrb.setId(lrb.getREPORTDATE() + lrb.getSECURITYCODE() + lrb.getREPORTTYPE());
                financeDao.merge(lrb);
            }
        }
    }

    public void syncLrbFromEastMoney(String code) throws Exception {
        syncLrbFromEastMoney(code, null);
    }

    /**
     * 同步资产负载表
     * @throws Exception
     */
    public void syncZcfzbFromEastMoney(String code, String endDate) throws Exception {

        String ctype = getCompanytype(code);


        String[] urls = {
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/zcfzbAjax?companyType=" + ctype +"&reportDateType=0&reportType=1&code=" + code + "&endDate=",
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/zcfzbAjax?companyType=" + ctype +"&reportDateType=0&reportType=2&code=" + code + "&endDate="
        };

        if(!isEmpty(endDate)) {
            for(int i = 0; i < urls.length; i++) {
                urls[i] += endDate;
            }
        }

        for (String url: urls) {

            String json = get(url, "UTF-8");
            json = JSON.parse(json).toString();

            List ret = JSON.parseArray(json);

            SimpleDateFormat sm = new SimpleDateFormat("yyyy/MM/dd H:mm:ss");
            for (Object o : ret) {
                Map<String, Object> e = (Map) o;

                for (Map.Entry<String, Object> ee : e.entrySet()) {
                    if (isEmpty(ee.getValue())) {
                        ee.setValue("0");
                    }
                }

                Zcfzb zcfzb = new Zcfzb();

                BeanWrapper beanWrapper = new BeanWrapperImpl(zcfzb);

                beanWrapper.setPropertyValues(new MutablePropertyValues(e));

                zcfzb.setDate(new java.sql.Date(sm.parse(zcfzb.getREPORTDATE()).getTime()));
                zcfzb.setId(zcfzb.getREPORTDATE() + zcfzb.getSECURITYCODE() + zcfzb.getREPORTTYPE());
                financeDao.merge(zcfzb);
            }
        }
    }

    public void syncZcfzbFromEastMoney(String code) throws Exception {
        syncZcfzbFromEastMoney(code, null);
    }

    public void syncXjllbFromEastMoney(String code, String endDate) throws Exception {

        String ctype = getCompanytype(code);

        String[] urls = {
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/xjllbAjax?companyType=" + ctype +"&reportDateType=0&reportType=1&code=" + code + "&endDate=",
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/xjllbAjax?companyType=" + ctype +"&reportDateType=0&reportType=2&code=" + code + "&endDate="
        };

        for(int i = 0; i < urls.length; i++) {
            urls[i] += endDate;
        }

        for(String url: urls) {
            String json = get(url, "UTF-8");

            json = JSON.parse(json).toString();

            List ret = JSON.parseArray(json);

            SimpleDateFormat sm = new SimpleDateFormat("yyyy/MM/dd H:mm:ss");

            for (Object o : ret) {
                Map<String, Object> e = (Map) o;

                for (Map.Entry<String, Object> ee : e.entrySet()) {
                    if (isEmpty(ee.getValue())) {
                        ee.setValue("0");
                    }
                }

                Xjllb xjllb = new Xjllb();

                BeanWrapper beanWrapper = new BeanWrapperImpl(xjllb);
                beanWrapper.setPropertyValues(new MutablePropertyValues(e));

                xjllb.setDate(new java.sql.Date(sm.parse(xjllb.getREPORTDATE()).getTime()));
                xjllb.setId(xjllb.getREPORTDATE() + xjllb.getSECURITYCODE() + xjllb.getREPORTTYPE());

                financeDao.merge(xjllb);
            }
        }
    }

    public void syncXjllbFromEastMoney(String code) throws Exception {
        syncXjllbFromEastMoney(code, null);
    }

    public void syncCwzbFromEastMoney(String code) throws Exception {

        String ctype = getCompanytype(code);


        String[] urls = new String[] {
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/MainTargetAjax?ctype=" + ctype + "&type=1&code=" + converCode(code),
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/MainTargetAjax?ctype=" + ctype + "&type=2&code=" + converCode(code)
        };

        for(String url: urls) {
            String json = get(url, "UTF-8");

            json = JSON.parse(json).toString();

            List ret = JSON.parseArray(json);

            SimpleDateFormat sm = new SimpleDateFormat("yyyy/MM/dd H:mm:ss");

            for (Object o : ret) {
                Map<String, Object> e = (Map) o;

                for (Map.Entry<String, Object> ee : e.entrySet()) {
                    if (isEmpty(ee.getValue()) || "--".equals(ee.getValue())) {
                        ee.setValue("0");
                    }
                }

                Cwzb cwzb = new Cwzb();

                BeanWrapper beanWrapper = new BeanWrapperImpl(cwzb);
                beanWrapper.setPropertyValues(new MutablePropertyValues(e));

                cwzb.setCode(code);
                cwzb.setId(cwzb.getDate() + code);

                financeDao.merge(cwzb);
            }
        }

    }

    public List<Lrb> queryLrb(String code, String reportType) {
        List ret =  financeDao.queryLrb(code, reportType);

        if(ret.isEmpty()) {
            try {
                syncLrbFromEastMoney(converCode(code));
                ret = financeDao.queryLrb(code, reportType);
            } catch (Exception e) {
                LOG.error("", e);
            }
        }

        return ret;
    }

    public List<Zcfzb> queryZcfzb(String code, String reportType) {
        List<Zcfzb> ret =  financeDao.queryZcfzb(code, reportType);

        if(ret.isEmpty()) {
            try {
                syncZcfzbFromEastMoney(converCode(code));
                ret = financeDao.queryZcfzb(code, reportType);
            } catch (Exception e) {
                LOG.error("", e);
            }
        }

        return ret;
    }

    public List<Xjllb> queryXjllb(String code, String reportType) {
        List<Xjllb> ret =  financeDao.queryXjllb(code, reportType);

        if(ret.isEmpty()) {
            try {
                syncXjllbFromEastMoney(converCode(code));
            } catch (Exception e) {
                LOG.error("", e);
            }

            ret = financeDao.queryXjllb(code, reportType);
        }

        return ret;
    }

    public List<Cwzb> queryCwzb(String code) {

        List<Cwzb> ret = financeDao.queryCwzb(code);

        if(ret.isEmpty()) {
            try {
                syncCwzbFromEastMoney(code);
            } catch (Exception e) {
                LOG.error("", e);
            }
            ret = financeDao.queryCwzb(code);
        }

        return ret;
    }
    private String converCode(String code) {

        int dotIndex = code.indexOf(".");

        if(dotIndex != -1) {
            String codePrefix = code.substring(0, dotIndex);
            String codeSuffix = code.substring(dotIndex + 1);

            return codeSuffix+codePrefix;
        }

        return code;
    }
}
