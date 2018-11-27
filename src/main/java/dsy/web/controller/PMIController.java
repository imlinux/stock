package dsy.web.controller;

import dsy.core.entity.PMI;
import dsy.web.service.PmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author dong
 * @since 18-11-27
 */
@Controller
@RequestMapping("/pmi")
@ResponseBody
public class PMIController {

    @Autowired
    private PmiService pmiService;

    @RequestMapping("/get_all")
    public List<PMI> getALL() {
        return pmiService.getALl();
    }
}
