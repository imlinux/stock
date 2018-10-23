package dsy.dao;

import dsy.entity.GdpYear;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author dong
 * @since 18-10-22
 */
@Repository
public class GdpYearDao {
    @PersistenceContext
    EntityManager em;

    public List<GdpYear> findAll() {

        Query query = em.createQuery("from GdpYear order by year");

        return query.getResultList();
    }
}
