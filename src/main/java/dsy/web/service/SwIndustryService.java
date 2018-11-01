package dsy.web.service;

import com.alibaba.fastjson.JSON;
import dsy.core.entity.SwIndustryHQ;
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
import java.util.Map;

import static dsy.core.tools.DateTool.getCurrentDayStr;
import static dsy.core.tools.DateTool.getCurrentDayTimestamp;

/**
 * @author dong
 * @since 18-11-1
 */
@Service
@Transactional
public class SwIndustryService {

    @Autowired
    IndustryDao industryDao;

    public void syncFromSinaSwIndustry() throws Exception {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("http://vip.stock.finance.sina.com.cn/q/view/SwHy.php"); //申万行业

        CloseableHttpResponse response = httpClient.execute(httpGet);

        try {
            HttpEntity entity1 = response.getEntity();

            String s = IOUtils.toString(entity1.getContent(), "GBK");

            int i = s.indexOf("{");

            s = s.substring(i);

            Map<String, Object> data = JSON.parseObject(s);

            for(Map.Entry<String, Object> e: data.entrySet()) {

                String[] value = ((String) e.getValue()).split(",");
                int index = 0;

                SwIndustryHQ swIndustryHQ = new SwIndustryHQ();

                swIndustryHQ.setId(e.getKey() + "_" + getCurrentDayStr());

                swIndustryHQ.setDate(new Date(getCurrentDayTimestamp()));

                swIndustryHQ.setCode(value[index ++]);
                swIndustryHQ.setSymbol(value[index ++]);
                swIndustryHQ.setCount(Integer.parseInt(value[index ++]));
                swIndustryHQ.setAvg(Float.parseFloat(value[index ++]));
                swIndustryHQ.setPriceChange(Float.parseFloat(value[index ++]));
                swIndustryHQ.setChangePercent(Float.parseFloat(value[index ++]));
                swIndustryHQ.setVolume(Float.parseFloat(value[index ++]));
                swIndustryHQ.setAmount(Float.parseFloat(value[index ++]));

                industryDao.merge(swIndustryHQ);
            }
        } finally {
            response.close();
        }

    }
}
