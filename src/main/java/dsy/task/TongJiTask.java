package dsy.task;

import dsy.web.service.GpjytjService;
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
public class TongJiTask {

    private Log LOG = LogFactory.getLog(getClass());

    @Autowired
    private GpjytjService gpjytjService;

    @Scheduled(fixedDelay = 10 * 60 * 1000)
    public void syncGpJytjFromEastMoney() throws Exception {

        LOG.info("开始同步东方财富全国股票交易统计信息");
        gpjytjService.syncGpJytjFromEastMoney();
        LOG.info("同步东方财富全国股票交易统计信息完成");
    }
}
