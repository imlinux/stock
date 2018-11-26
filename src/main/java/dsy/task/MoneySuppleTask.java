package dsy.task;

import dsy.web.service.MoneySupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author dong
 * @since 18-11-26
 */
@Component
public class MoneySuppleTask {

    @Autowired
    MoneySupplyService moneySupplyService;


    @Scheduled(fixedDelay = 10 * 60 * 1000)
    public void syncFromStatsOfgov() throws Exception {
        moneySupplyService.syncFromStatsOfgov();
    }
}
