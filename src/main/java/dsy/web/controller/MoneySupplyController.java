package dsy.web.controller;

import dsy.core.entity.MoneySupply;
import dsy.web.service.MoneySupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dong
 * @since 18-10-23
 */
@Controller
@RequestMapping("/money_supply")
@ResponseBody
public class MoneySupplyController {

    @Autowired
    private MoneySupplyService moneySupplyService;


    @RequestMapping("/get_all")
    public List<MoneySupply> getAll() {
        return moneySupplyService.getAll();
    }
}
