package dsy.web.controller;

import dsy.core.entity.Fdl;
import dsy.web.service.FdlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dong
 * @since 18-11-26
 */
@Controller
@RequestMapping("/fdl")
@ResponseBody
public class FdlController {

    @Autowired
    private FdlService fdlService;

    @RequestMapping("/get_all")
    List<Fdl> getAll() {
        return fdlService.getAll();
    }
}
