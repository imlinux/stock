package dsy.web.controller;

import dsy.core.entity.WallStreetcnCompanyHQ;
import dsy.web.dto.QueryCompany;
import dsy.web.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dong
 * @since 18-11-1
 */
@Controller
@RequestMapping("/company")
@ResponseBody
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/sync_company_from_sina")
    public void syncCompanyFromSina() throws Exception {

        companyService.syncCompanyFromSina();
    }

    @RequestMapping("/sync_company_from_wall_street")
    public void syncCompanyFromWallStreetcn() throws Exception {
        companyService.syncCompayFromWallStreetCn();
    }

    @RequestMapping("/query_company")
    public List<QueryCompany> queryCompany(@RequestParam String codeOrName) {
        return companyService.queryCompany(codeOrName);
    }

    @RequestMapping("/company_hq")
    public List<WallStreetcnCompanyHQ> currentTradeCompanyHq() throws Exception {

        return companyService.companyHQ();
    }
}
