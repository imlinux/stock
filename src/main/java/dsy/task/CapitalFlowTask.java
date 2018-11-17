package dsy.task;

import dsy.web.service.CapitalFlowService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author dong
 * @since 18-11-17
 */
@Component
public class CapitalFlowTask {
    private Log LOG = LogFactory.getLog(getClass());

    @Autowired
    private CapitalFlowService capitalFlowService;


    @Scheduled(fixedDelay = 10 * 60 * 1000)
    public void syncIndustryCapitalFlowFromEastMoney() throws Exception {
        LOG.info("开始同步行业资金流向");
        capitalFlowService.syncIndustryCapitalFlowFromEastMoney();
        LOG.info("同步行业资金流向完成");
    }
}
