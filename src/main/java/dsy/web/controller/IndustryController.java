package dsy.web.controller;

import dsy.core.entity.SwIndustryHQ;
import dsy.web.service.SwIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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

    List<SwIndustryHQ> getSinaSwHq() {
        return null;
    }

    @RequestMapping("/sync_from_sina")
    void syncFromSina() throws Exception {

        swIndustryService.syncFromSinaSwIndustry();
    }
}
