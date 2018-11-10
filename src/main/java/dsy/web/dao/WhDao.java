package dsy.web.dao;

import dsy.core.entity.Wh;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author dong
 * @since 18-11-6
 */
@Repository
public class WhDao extends GeneralDao {

    public List<Wh> getLates() throws Exception {

        TypedQuery<Wh> query = em.createQuery("select e from Wh e where e.date = '2018-11-08'", Wh.class);

        //query.setParameter("date", new java.sql.Date(parse("2018-11-08").getTime()));

        return query.getResultList();
    }
}
