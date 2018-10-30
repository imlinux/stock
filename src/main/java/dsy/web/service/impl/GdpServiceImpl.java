package dsy.web.service.impl;

import dsy.web.dao.GdpDao;
import dsy.core.entity.Gdp;
import dsy.web.service.GdpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author dong
 * @since 18-10-22
 */
@Service
@Transactional
public class GdpServiceImpl implements GdpService {

    @Autowired
    GdpDao gdpDao;

    @Override
    public List<Gdp> getGdpYear() {
        return gdpDao.findAll();
    }

    @Override
    public Gdp getLatest() {
        return gdpDao.getLatestGdp();
    }
}
