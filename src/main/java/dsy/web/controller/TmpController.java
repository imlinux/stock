package dsy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dong
 * @since 18-10-22
 * 探索spring boot mvc
 */
@Controller
public class TmpController {

    @RequestMapping("/tmp")
    @ResponseBody
    public Map<String, Object> tmp1() {
        Map<String, Object> ret = new HashMap<>();
        ret.put("data", "hello");
        return ret;
    }
}
