package dsy.task;

import dsy.web.service.CompanyService;
import dsy.web.service.SwIndustryService;
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
public class HqTask {

    private Log LOG = LogFactory.getLog(getClass());

    @Autowired
    private CompanyService companyService;

    @Autowired
    private SwIndustryService swIndustryService;

    @Scheduled(fixedDelay = 10 * 60 * 1000)
    public void syncFromSinaSwIndustry() {

        try {
            LOG.info("开始同步新浪申万行业行情");
            swIndustryService.syncFromSinaSwIndustry();
            LOG.info("新浪申万行业行情同步完成");
        } catch (Exception e) {
            LOG.error("", e);
        }
    }

    @Scheduled(fixedDelay = 10 * 60 * 1000)
    public void syncCompayFromWallStreetcn() {

        try {
            LOG.info("开始同步华尔街见闻个股行情");
            companyService.syncCompayFromWallStreetcn();
            LOG.info("华尔街见闻个股行情同步完成");
        } catch (Exception e) {
            LOG.error("", e);
        }
    }

}
