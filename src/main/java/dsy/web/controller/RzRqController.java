package dsy.web.controller;

import dsy.web.dto.RzrqDto;
import dsy.web.service.RzRqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static dsy.core.tools.DateTool.parse;
import static dsy.core.tools.StringTool.isEmpty;

/**
 * @author dong
 * @since 18-10-23
 */
@Controller
@RequestMapping("/rzrq")
@ResponseBody
public class RzRqController {

    @Autowired
    private RzRqService rzRqService;

    /**
     * 获取融资融券余额占gdp百分比
     * @return
     */
    @RequestMapping("/get_rzrq_gdp")
    public List<RzrqDto> getRzrqYezbGdp() {
        return rzRqService.getRzRqyeZbGdp();
    }


    @RequestMapping("/sync_from_easy_money_rzrq_detial")
    public void syncFromEasyMoneyRzRqDetial(@RequestParam String from, @RequestParam(required = false) String to) throws Exception {

        if(isEmpty(to)) {
            rzRqService.syncFromEastMoneyDetialByDay(parse(from));
        } else {
            rzRqService.syncFromEastMoneyDetial(parse(from), parse(to));
        }
    }

    @RequestMapping("/sync_rzrq_from_easy_money")
    public void syncRzrqFromEastMoney(@RequestParam(defaultValue = "false") boolean updateAll) throws Exception {
        rzRqService.syncRzrqFromEastMoney(updateAll);
    }
}
