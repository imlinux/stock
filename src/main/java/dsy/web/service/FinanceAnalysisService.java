package dsy.web.service;

import com.alibaba.fastjson.JSON;
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
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/lrbAjax?companyType=" + ctype + "&reportDateType=0&reportType=1&endDate=" + endDate + "&code=" + code, //按报告期和报告期同比
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/lrbAjax?companyType=" + ctype + "&reportDateType=0&reportType=2&endDate=" + endDate + "&code=" + code//按单季度和按季度环比
        };

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

    /**
     * 同步资产负载表
     * @throws Exception
     */
    public void syncZcfzbFromEastMoney(String code, String endDate) throws Exception {

        String ctype = getCompanytype(code);


        String[] urls = {
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/zcfzbAjax?companyType=" + ctype +"&reportDateType=0&reportType=1&endDate=" + endDate + "&code=" + code,
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/zcfzbAjax?companyType=" + ctype +"&reportDateType=0&reportType=2&endDate=" + endDate + "&code=" + code
        };

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

    public void syncXjllbFromEastMoney(String code, String endDate) throws Exception {

        String ctype = getCompanytype(code);

        String[] urls = {
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/xjllbAjax?companyType=" + ctype +"&reportDateType=0&reportType=1&endDate=" + endDate + "&code=" + code,
                "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/xjllbAjax?companyType=" + ctype +"&reportDateType=0&reportType=2&endDate=" + endDate + "&code=" + code
        };

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

    public List<Lrb> queryLrb(String code, String reportType) {
        return financeDao.query(code, reportType);
    }
}
