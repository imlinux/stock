package dsy.web.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dong
 * @since 18-11-27
 */
@Repository
public class AllDataSqlDao extends GeneralDao {

    public <T> List<T> executeQuery(String hql) {

        return em.createQuery(hql).getResultList();
    }
}
