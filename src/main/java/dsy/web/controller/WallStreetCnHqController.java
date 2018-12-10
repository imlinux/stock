package dsy.web.controller;

import dsy.core.entity.MarketType;
import dsy.core.entity.WallStreetCnHq;
import dsy.web.dto.SearchCompany;
import dsy.web.service.WallStreetCnHqService;
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
public class WallStreetCnHqController {

    @Autowired
    private WallStreetCnHqService wallStreetCnHqService;

    @RequestMapping("/sync_hq_from_wall_street")
    public void syncCompanyFromWallStreetcn(@RequestParam String code, @RequestParam MarketType marketType) throws Exception {
        wallStreetCnHqService.syncHqByCodeFromWallStreetCn(code, marketType);
    }

    /**
     * 根据关键字和代码搜索股票，
     * @param codeOrName
     * @return 结果按时间和成交额逆序排序
     */
    @RequestMapping("/search_company")
    public List<SearchCompany> searchCompany(@RequestParam String codeOrName) {
        return wallStreetCnHqService.searchCompany(codeOrName);
    }

    @RequestMapping("/company_hq")
    public List<WallStreetCnHq> currentTradeCompanyHq() throws Exception {

        return wallStreetCnHqService.getLatestCompanyHq();
    }
}
