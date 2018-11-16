package dsy.web.dao;

import dsy.core.entity.EastMoneyRzrq;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dong
 * @since 18-11-2
 */
@Repository
public class RzRqDao extends GeneralDao {

    public List<EastMoneyRzrq> getAll() {

        return em.createQuery("select e from EastMoneyRzrq e order by e.date", EastMoneyRzrq.class).getResultList();
    }
}
