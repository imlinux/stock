package dsy.task;

import dsy.core.entity.WallStreetCnHq;
import dsy.web.dao.WallStreetCnHqDao;
import dsy.web.service.AnalyzeGdService;
import dsy.web.service.FinanceAnalysisService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

import static dsy.core.tools.Tool.pauseTime;

@Component
public class AnalyzeGdTask {
    private Log LOG = LogFactory.getLog(getClass());

    @Autowired
    private WallStreetCnHqDao wallStreetCnHqDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    private AnalyzeGdService analyzeGdService;

    @Autowired
    private FinanceAnalysisService financeAnalysisService;

    @Scheduled(fixedDelay = 10 * 60 * 1000)
    public void syncGd() throws Exception {

        List<WallStreetCnHq> wallStreetCnHqList = wallStreetCnHqDao.getLatestCompanyHq(-1);
        wallStreetCnHqList.forEach( e -> {

            transactionTemplate.execute( transactionStatus -> {
                try {
                    analyzeGdService.syncGdFromEasyMoney(e.getProdCode());
                    financeAnalysisService.syncCwzbFromEastMoney(e.getProdCode());
                } catch (Exception ex) {
                    LOG.error("", ex);
                }
                return null;
            });
            pauseTime();
        });
    }
}
