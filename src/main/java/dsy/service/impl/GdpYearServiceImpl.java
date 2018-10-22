package dsy.service.impl;

import dsy.dao.GdpYearDao;
import dsy.entity.GdpYear;
import dsy.service.GdpYearService;
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
public class GdpYearServiceImpl implements GdpYearService {

    @Autowired
    GdpYearDao gdpYearDao;

    @Override
    public List<GdpYear> getGdpYear() {
        return gdpYearDao.findAll();
    }
}
