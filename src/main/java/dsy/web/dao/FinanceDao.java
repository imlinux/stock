package dsy.web.dao;

import dsy.core.entity.Lrb;
import dsy.core.entity.Xjllb;
import dsy.core.entity.Zcfzb;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author dong
 * @since 18-11-3
 */
@Repository
public class FinanceDao extends GeneralDao {

    public List<Lrb> queryLrb(String code, String reportType) {
        TypedQuery query = em.createQuery("select l from Lrb l where l.SECURITYCODE=:code and l.REPORTTYPE=:reportType order by l.date desc", Lrb.class);
        query.setParameter("code", code);
        query.setParameter("reportType", reportType);
        query.setMaxResults(10);
        return  query.getResultList();
    }

    public List<Zcfzb> queryZcfzb(String code, String reportType) {
        TypedQuery<Zcfzb> query  = em.createQuery("select l from Zcfzb l where l.SECURITYCODE=:code and l.REPORTTYPE=:reportType order by l.date desc", Zcfzb.class);
        query.setParameter("code", code);
        query.setParameter("reportType", reportType);
        query.setMaxResults(10);
        return query.getResultList();
    }

    public List<Xjllb> queryXjllb(String code, String reportType) {
        TypedQuery<Xjllb> query  = em.createQuery("select l from Xjllb l where l.SECURITYCODE=:code and l.REPORTTYPE=:reportType order by l.date desc", Xjllb.class);
        query.setParameter("code", code);
        query.setParameter("reportType", reportType);
        query.setMaxResults(10);
        return query.getResultList();
    }
}
