package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.CompanyHQ;
import dsy.web.dao.CompanyDao;
import dsy.web.dao.IndustryDao;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

import static dsy.core.tools.DateTool.getCurrentDayStr;
import static dsy.core.tools.DateTool.getCurrentDayTimestamp;

/**
 * @author dong
 * @since 18-11-1
 */
@Service
@Transactional
public class CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    IndustryDao industryDao;

    public void syncCompanyFromSina() throws Exception {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        for (int i = 1;true; i++) {
            HttpGet httpGet = new HttpGet("http://vip.stock.finance.sina.com.cn/quotes_service/api/json_v2.php/Market_Center.getHQNodeData?num=80&sort=symbol&asc=1&node=hs_a&symbol=&_s_r_a=page&page=" + i);

            CloseableHttpResponse response = httpClient.execute(httpGet);

            try {
                HttpEntity entity1 = response.getEntity();

                String s = IOUtils.toString(entity1.getContent(), "GBK");

                try {
                    List<CompanyHQ> companyHQList = JSON.parseArray(s, CompanyHQ.class);

                    Thread.sleep(1000);
                    for (CompanyHQ e : companyHQList) {
                        e.setId(e.getCode() + "_" + getCurrentDayStr());
                        e.setDate(new Date(getCurrentDayTimestamp()));
                        companyDao.merge(e);
                    }
                } catch (Exception e) {
                    break;
                }


            } finally {
                response.close();
            }
        }
    }
}
