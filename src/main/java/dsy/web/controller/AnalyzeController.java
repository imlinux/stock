package dsy.web.controller;

import dsy.web.service.AnalyzeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dong
 * @since 18-11-27
 */
@Controller
@RequestMapping("/analyze")
@ResponseBody
public class AnalyzeController {

    @Autowired
    private AnalyzeService analyzeService;

    @RequestMapping("/get_data")
    public List getData(@RequestParam String hql) throws Exception {

        return analyzeService.getData(hql);
    }
}
