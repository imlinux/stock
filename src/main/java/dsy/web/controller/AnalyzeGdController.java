package dsy.web.controller;

import dsy.web.service.AnalyzeGdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/analyze_gd")
@ResponseBody
public class AnalyzeGdController {

    @Autowired
    private AnalyzeGdService analyzeGdService;

}
