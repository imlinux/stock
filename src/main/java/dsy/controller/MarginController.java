package dsy.controller;

import dsy.dto.HSMargin;
import dsy.service.MarginService;
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
@RequestMapping("/rzrq")
@ResponseBody
public class MarginController {

    @Autowired
    private MarginService marginService;

    @RequestMapping("/get_all")
    public List<HSMargin> getAll() {
        return marginService.getRzRq();
    }
}
