package dsy.web.service;

import dsy.core.entity.Gdp;
import dsy.web.dao.GdpDao;
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
public class GdpService {

    @Autowired
    GdpDao gdpDao;

    public List<Gdp> getGdpYear() {
        return gdpDao.findAll();
    }

    public Gdp getLatest() {
        return gdpDao.getLatestGdp();
    }
}
