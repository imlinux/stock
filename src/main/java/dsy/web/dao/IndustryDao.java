package dsy.web.dao;

import dsy.core.entity.SwIndustryHQ;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dong
 * @since 18-11-1
 */
@Repository
public class IndustryDao extends GeneralDao {


    public List<SwIndustryHQ> getAllIndustryCode() {

        return em.createQuery("select e from SwIndustryHQ e", SwIndustryHQ.class).getResultList();
    }
}
