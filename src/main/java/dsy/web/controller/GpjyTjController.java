package dsy.web.controller;

import dsy.web.dto.BuffettRationTo;
import dsy.web.service.GpjytjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dong
 * @since 18-11-17
 */
@Controller
@RequestMapping("/gpjytj/")
@ResponseBody
public class GpjyTjController {

    @Autowired
    private GpjytjService gpjytjService;

    @RequestMapping("/get_all")
    public List<BuffettRationTo> buffettRatio() {

        return gpjytjService.buffettRatio();
    }
}
