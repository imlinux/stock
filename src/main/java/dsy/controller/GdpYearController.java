package dsy.controller;

import dsy.entity.GdpYear;
import dsy.service.GdpYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dong
 * @since 18-10-22
 */
@Controller
@RequestMapping("/gdp/")
@ResponseBody
public class GdpYearController {

    @Autowired
    private GdpYearService gdpYearService;

    @RequestMapping("/year")
    public List<GdpYear> getGdpYear() {
        return gdpYearService.getGdpYear();
    }
}
