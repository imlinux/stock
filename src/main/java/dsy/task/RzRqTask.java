package dsy.task;

import dsy.web.service.RzRqService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author dong
 * @since 18-11-2
 */
@Component
public class RzRqTask {
    private Log LOG = LogFactory.getLog(getClass());

    @Autowired
    private RzRqService rzRqService;

    @Scheduled(fixedDelay = 10 * 60 * 1000)
    public void syncFromEastMoney() {
        try {
            LOG.info("开始同步东方财富融资融券详细信息");
            rzRqService.syncFromEastMoneyDetial();
            LOG.info("同步东方财富融资融券详细信息完成");
        } catch (Exception e) {
            LOG.error("", e);
        }
    }
}
