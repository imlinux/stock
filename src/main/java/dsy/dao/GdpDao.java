package dsy.dao;

import dsy.entity.Gdp;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author dong
 * @since 18-10-22
 */
@Repository
public class GdpDao {
    @PersistenceContext
    EntityManager em;

    public List<Gdp> findAll() {

        Query query = em.createQuery("select g from Gdp g order by g.year");

        return query.getResultList();
    }

    public Gdp getLatestGdp() {
        TypedQuery<Gdp> query = em.createQuery("select t from Gdp t where t.year='2017'", Gdp.class);
        return query.getSingleResult();
    }
}
