package dsy.web.controller;

import dsy.core.entity.Gdp;
import dsy.web.service.GdpService;
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
public class GdpController {

    @Autowired
    private GdpService gdpService;

    @RequestMapping("/year")
    public List<Gdp> getGdpYear() {
        return gdpService.getGdpYear();
    }


    @RequestMapping("/sync_gdp")
    public void syncGdp() throws Exception {

        gdpService.syncFromSina();
    }

    public Gdp getLatestGdp() {
        return gdpService.getLatest();
    }
}
