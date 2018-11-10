package dsy.web.dao;

import dsy.core.entity.Wh;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.sql.Date;
import java.util.List;

/**
 * @author dong
 * @since 18-11-6
 */
@Repository
public class WhDao extends GeneralDao {

    public List<Wh> getLates(Date date) throws Exception {

        TypedQuery<Wh> query = em.createQuery("select e from Wh e where e.date = :date", Wh.class);

        query.setParameter("date", date);

        return query.getResultList();
    }
}
