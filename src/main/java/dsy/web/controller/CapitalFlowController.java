package dsy.web.controller;

import dsy.core.entity.CapitalFlow;
import dsy.web.service.CapitalFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/capital_flow")
@ResponseBody
public class CapitalFlowController {

    @Autowired
    private CapitalFlowService capitalFlowService;


    /**
     * 获取个股每天资金流
     * @param code
     * @return
     * @throws Exception
     */
    @RequestMapping("/company_capital_flow")
    public List<CapitalFlow> getCompanyCapitalFlow(@RequestParam String code) throws Exception {

        return capitalFlowService.getCompanyCapitalFlow(code);
    }
}
