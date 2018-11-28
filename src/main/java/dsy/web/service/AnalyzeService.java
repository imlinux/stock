package dsy.web.service;

import dsy.web.dao.AllDataSqlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dong
 * @since 18-11-27
 */
@Service
public class AnalyzeService {

    @Autowired
    private AllDataSqlDao allDataSqlDao;


    public List getData(String hql, String entity) throws Exception {


        return allDataSqlDao.executeQuery(hql, Class.forName(entity));
    }
}
