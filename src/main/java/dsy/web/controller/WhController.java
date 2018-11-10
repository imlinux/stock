package dsy.web.controller;

import dsy.core.entity.Wh;
import dsy.web.service.WhService;
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
    private WhService whService;

    @RequestMapping("/get_latest")
    public List<Wh> getLatest() throws Exception {

        return whService.getLatest();
    }
}
