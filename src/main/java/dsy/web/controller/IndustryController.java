package dsy.web.controller;

import dsy.core.entity.IndustryHQ;
import dsy.web.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static dsy.core.tools.StringTool.isEmpty;

/**
 * @author dong
 * @since 18-11-1
 */
@Controller
@RequestMapping("/industry/")
@ResponseBody
public class IndustryController {

    @Autowired
    private IndustryService industryService;


    @RequestMapping("/get_industry_hq")
    List<IndustryHQ> getIndustryHQ(@RequestParam(required = false) String date) throws Exception {

        if(isEmpty(date)) {
            return industryService.getAllIndustryHq();
        } else {
            return industryService.getAllIndustryHq(date);
        }
    }
}
