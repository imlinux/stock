package dsy.web.service;

import dsy.web.dao.GdpDao;
import dsy.web.dao.MarginDao;
import dsy.web.dto.HSMargin;
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
public class MarginService {

    @Autowired
    MarginDao marginDao;

    @Autowired
    GdpDao gdpDao;

    public List<HSMargin> getRzRq() {
        List<HSMargin> l = marginDao.findAll();

        return l;
    }
}
