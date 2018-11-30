package dsy.web.controller;

import dsy.web.service.TongYeChaiJieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dong
 * @since 18-11-30
 */
@Controller
@RequestMapping("/tong_ye_chai_jie")
@ResponseBody
public class TongYeChaiJieController {

    @Autowired
    private TongYeChaiJieService tongYeChaiJieService;

    @RequestMapping("/sync_all_from_east_money")
    public void syncFromEastMoney() throws Exception {
        tongYeChaiJieService.syncAllDataFromEastMoney(-1);
    }
}
