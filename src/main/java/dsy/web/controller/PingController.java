package dsy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dong
 * @since 18-10-22
 */
@Controller
public class PingController {

    @RequestMapping("/ping")
    @ResponseBody
    String pang() {
        return "pang";
    }
}
