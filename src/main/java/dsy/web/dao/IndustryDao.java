package dsy.web.dao;

import dsy.core.entity.SwIndustryHQ;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author dong
 * @since 18-11-1
 */
@Repository
public class IndustryDao extends GeneralDao {


    public List<SwIndustryHQ> getAllIndustryCode(String date) {

        TypedQuery<SwIndustryHQ> query = em.createQuery("select e from SwIndustryHQ e where e.date = :date", SwIndustryHQ.class);
        query.setParameter("date", date);
        return query.getResultList();
    }

    public String getLatestTradeDate() {
        Query query = em.createQuery("select max(e.date) from SwIndustryHQ e");
        return (String) query.getSingleResult();
    }
}
