package dsy.web.dao;

import dsy.web.dto.QueryCompany;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dong
 * @since 18-11-1
 */
@Repository
public class CompanyDao extends GeneralDao {

    public List<QueryCompany> queryCompany(String codeOrName) {

        Query query = em.createQuery("select distinct e.prodName, e.prodCode from WallStreetcnCompanyHQ e where e.prodName like :name or e.prodCode like :code");

        query.setParameter("name", "%" + codeOrName + "%");
        query.setParameter("code", "%" + codeOrName + "%");
        query.setMaxResults(5);

        List<Object[]> l = query.getResultList();
        List<QueryCompany> ret = new ArrayList<>();

        for(Object[] e: l) {
            QueryCompany rec = new QueryCompany();

            rec.setName((String) e[0]);
            rec.setCode((String) e[1]);
            ret.add(rec);
        }


        return ret;
    }
}
