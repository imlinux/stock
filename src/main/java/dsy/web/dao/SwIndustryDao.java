package dsy.web.dao;

import dsy.core.entity.SwIndustryHQ;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author dong
 * @since 18-11-1
 */
@Repository
public class SwIndustryDao {

    @PersistenceContext
    private EntityManager em;

    public void syncDb(SwIndustryHQ swIndustryHQ) {

        em.merge(swIndustryHQ);
    }
}
