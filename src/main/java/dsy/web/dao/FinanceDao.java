package dsy.web.dao;

import dsy.core.entity.Lrb;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author dong
 * @since 18-11-3
 */
@Repository
public class FinanceDao extends GeneralDao {

    public List<Lrb> query(String code, String reportType) {
        TypedQuery query = em.createQuery("select l from Lrb l where l.SECURITYCODE=:code and l.REPORTTYPE=:reportType order by l.date desc", Lrb.class);
        query.setParameter("code", code);
        query.setParameter("reportType", reportType);
        query.setMaxResults(5);
        return  query.getResultList();
    }
}
