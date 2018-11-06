package dsy.web.controller;

import dsy.core.entity.SwIndustryHQ;
import dsy.web.service.SwIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

import static dsy.core.tools.DateTool.getDayStr;
import static dsy.core.tools.DateTool.parse;
import static dsy.core.tools.StringTool.isEmpty;
import static dsy.core.tools.TradeTool.getLatestTrade;

/**
 * @author dong
 * @since 18-11-1
 */
@Controller
@RequestMapping("/industry/")
@ResponseBody
public class IndustryController {

    @Autowired
    private SwIndustryService swIndustryService;

    @RequestMapping("/sync_from_sina")
    void syncFromSinaSwIndustry() throws Exception {

        swIndustryService.syncFromSinaSwIndustry();
    }


    @RequestMapping("/get_sw_industry_hq")
    List<SwIndustryHQ> getSwIndustryHQ(@RequestParam(required = false) String date) throws Exception {

        Date d = null;
        if(isEmpty(date)) {
            d = getLatestTrade();
            d = parse(getDayStr(d));
        } else {
            d = parse(date);
        }
        return swIndustryService.getAllSwIndustryHq(new java.sql.Date(d.getTime()));
    }
}
