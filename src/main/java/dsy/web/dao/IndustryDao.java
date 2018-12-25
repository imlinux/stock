package dsy.web.dao;

import dsy.core.entity.IndustryHQ;
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


    public List<IndustryHQ> getAllIndustryCode(String date) {

        TypedQuery<IndustryHQ> query = em.createQuery("select e from IndustryHQ e where e.date = :date", IndustryHQ.class);
        query.setParameter("date", date);
        return query.getResultList();
    }

    public String getLatestTradeDate() {
        Query query = em.createQuery("select max(e.date) from IndustryHQ e");
        return (String) query.getSingleResult();
    }
}
