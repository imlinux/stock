package dsy.task;

import dsy.web.service.HouseHqService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HoustTask {
    private Log LOG = LogFactory.getLog(getClass());

    @Autowired
    private HouseHqService houseHqService;

    @Scheduled(cron = "0 0 11 * * ?")
    public void syncErShouFangFromAnjuke() {

        try {
            LOG.info("开始同步安居客二手房行情");
            houseHqService.syncErShouHouseFromAnjuke();
            LOG.info("安居客二手房同步完成");
        } catch (Exception e) {
            LOG.error(e);
        }
    }

    @Scheduled(cron = "0 0 12 * * ?")
    public void syncZuFromAnJeKe() {
        try {
            LOG.info("开始同步安居客租房行情");
            houseHqService.syncZuFromAnJeKe();
            LOG.info("安居客租房行情同步完成");
        } catch (Exception e) {
            LOG.error(e);
        }
    }
}
