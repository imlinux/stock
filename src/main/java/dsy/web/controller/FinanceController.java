package dsy.web.controller;

import dsy.core.entity.Lrb;
import dsy.core.entity.Zcfzb;
import dsy.web.service.FinanceAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URLEncoder;
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
    public void sync_lrb(@RequestParam String code, @RequestParam(defaultValue = "") String endDate) throws Exception {

        financeAnalysisService.syncLrbFromEastMoney(code, URLEncoder.encode(endDate + " 0:00:00", "UTF-8"));
    }

    @RequestMapping("/sync_zcfzb")
    public void sync_zcfzb(@RequestParam String code, @RequestParam(defaultValue = "") String endDate) throws Exception {

        financeAnalysisService.syncZcfzbFromEastMoney(code, URLEncoder.encode(endDate + " 0:00:00", "UTF-8"));
    }

    @RequestMapping("/sync_xjllb")
    public void sync_xjllb(@RequestParam String code, @RequestParam(defaultValue = "") String endDate) throws Exception {

        financeAnalysisService.syncXjllbFromEastMoney(code, URLEncoder.encode(endDate + " 0:00:00", "UTF-8"));
    }

    @RequestMapping("/query_lrb")
    public List<Lrb> queryLrb(@RequestParam String code,
                              @RequestParam String reportType) {

        return financeAnalysisService.queryLrb(code, reportType);
    }

    @RequestMapping("/query_zcfzb")
    public List<Zcfzb> queryZcfzb(@RequestParam String code,
                                  @RequestParam String reportType) {

        return financeAnalysisService.queryZcfzb(code, reportType);
    }
}
