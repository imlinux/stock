package dsy.web.controller;

import dsy.core.entity.Lrb;
import dsy.web.service.FinanceAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @RequestMapping("/sync_zcfzb")
    public void sync_zcfzb(@RequestParam String code) throws Exception {

        financeAnalysisService.syncZcfzbFromEastMoney(code);
    }

    @RequestMapping("/sync_xjllb")
    public void sync_xjllb(@RequestParam String code) throws Exception {

        financeAnalysisService.syncXjllbFromEastMoney(code);
    }

    @RequestMapping("/query_lrb")
    public List<Lrb> queryLrb(@RequestParam String code,
                              @RequestParam String reportType) {

        return financeAnalysisService.queryLrb(code, reportType);
    }
}
