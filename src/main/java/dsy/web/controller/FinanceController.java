package dsy.web.controller;

import dsy.web.service.FinanceAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dong
 * @since 18-11-3
 */
@Controller
@RequestMapping("/finance")
@ResponseBody
public class FinanceController {

    @Autowired
    private FinanceAnalysisService financeAnalysisService;

    @RequestMapping("/sync_lrb")
    public void sync_lrb(@RequestParam String code) throws Exception {

        financeAnalysisService.syncLrbFromEastMoney(code);
    }
}
