package dsy.task;

import dsy.web.service.PmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author dong
 * @since 18-11-27
 */
@Component
public class PMITask {

    @Autowired
    private PmiService pmiService;


    @Scheduled(fixedDelay = 10 * 60 * 1000)
    public void syncFromStatsOfgov() throws Exception {
        pmiService.syncFromStatsOfgov();
    }
}
