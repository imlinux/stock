package dsy.web.dao;

import dsy.core.entity.CapitalFlow;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author dong
 * @since 18-11-16
 */
@Repository
public class CapitalFlowDao extends GeneralDao {

    public List<CapitalFlow> getCompanyAllCapitalFlow(String code) {

        TypedQuery<CapitalFlow> query = em.createQuery("select e from CapitalFlow e where e.code=:code", CapitalFlow.class);
        query.setParameter("code", code);

        return query.getResultList();
    }
}