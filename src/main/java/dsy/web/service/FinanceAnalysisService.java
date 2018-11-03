package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.Lrb;
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

    public void syncLrbFromEastMoney(String code) throws Exception {

        String ctype = getCompanytype(code);

        String url = "http://emweb.securities.eastmoney.com/NewFinanceAnalysis/lrbAjax?companyType=" + ctype + "&reportDateType=0&reportType=1&endDate=&code=" + code;


        String json = get(url, "UTF-8");

        json = JSON.parse(json).toString();
        List ret = JSON.parseArray(json);

        LOG.info(json);

        for(Object o: ret) {
            Map<String, Object> e = (Map) o;

            for(Map.Entry<String, Object> ee: e.entrySet()) {
                if(isEmpty(ee.getValue())) {
                    ee.setValue("0");
                }
            }

            Lrb lrb = new Lrb();
            BeanWrapper beanWrapper = new BeanWrapperImpl(lrb);

            beanWrapper.setPropertyValues(new MutablePropertyValues(e));

            lrb.setId(lrb.getREPORTDATE() + lrb.getSECURITYCODE());
            financeDao.merge(lrb);
        }
    }
}
