package dsy.service.impl;

import dsy.dao.GdpDao;
import dsy.dao.MarginDao;
import dsy.dto.HSMargin;
import dsy.entity.Gdp;
import dsy.service.MarginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author dong
 * @since 18-10-23
 */
@Service
@Transactional
public class MarginServiceImpl implements MarginService {

    @Autowired
    MarginDao marginDao;

    @Autowired
    GdpDao gdpDao;

    @Override
    public List<HSMargin> getRzRq() {
        List<HSMargin> l = marginDao.findAll();
        Gdp gdp = gdpDao.getLatestGdp();

        for(HSMargin e: l) {
            e.setTradeValGdp(e.getTradeVal() / gdp.getGdp() / 100000000.0 * 100);

        }
        return l;
    }
}
