package dsy.web.dao;

import dsy.core.entity.SwIndustryHQ;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.sql.Date;
import java.util.List;

/**
 * @author dong
 * @since 18-11-1
 */
@Repository
public class IndustryDao extends GeneralDao {


    public List<SwIndustryHQ> getAllIndustryCode(Date date) {

        TypedQuery<SwIndustryHQ> query = em.createQuery("select e from SwIndustryHQ e where e.date = :date", SwIndustryHQ.class);
        query.setParameter("date", date);
        return query.getResultList();
    }
}
