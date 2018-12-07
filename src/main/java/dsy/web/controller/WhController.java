package dsy.web.controller;

import dsy.core.entity.WallStreetCnHq;
import dsy.web.service.WallStreetCnHqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dong
 * @since 18-11-6
 */
@Controller
@RequestMapping("/wh")
@ResponseBody
public class WhController {

    @Autowired
    private WallStreetCnHqService wallStreetCnHqService;

    @RequestMapping("/get_latest")
    public List<WallStreetCnHq> getLatest() throws Exception {

        return wallStreetCnHqService.getLatestWhHq();
    }
}
