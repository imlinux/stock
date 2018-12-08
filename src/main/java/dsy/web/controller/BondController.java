package dsy.web.controller;

import dsy.core.entity.WallStreetCnHq;
import dsy.web.service.WallStreetCnHqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/bond/")
@ResponseBody
public class BondController {

    @Autowired
    private WallStreetCnHqService wallStreetCnHqService;


    @RequestMapping("/get_all_bond")
    public List<WallStreetCnHq> getAllBond() throws Exception {
        return wallStreetCnHqService.getAllBondHq();
    }
}
