package dsy.web.controller;

import dsy.web.service.AnalyzeGdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/analyze/gd")
@ResponseBody
public class AnalyzeGdController {

    @Autowired
    private AnalyzeGdService analyzeGdService;


    @RequestMapping("/sync")
    public void syncGdRs(@RequestParam String code) throws Exception {
        analyzeGdService.syncGdFromEasyMoney(code);
    }
}
