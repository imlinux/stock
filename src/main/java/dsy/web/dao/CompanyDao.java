package dsy.web.dao;

import dsy.core.entity.WallStreetcnCompanyHQ;
import dsy.web.dto.QueryCompany;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

import static dsy.core.tools.TradeTool.getLatestTrade;

/**
 * @author dong
 * @since 18-11-1
 */
@Repository
public class CompanyDao extends GeneralDao {

    public List<QueryCompany> queryCompany(String codeOrName) {

        Query query = em.createQuery("select distinct e.prodName, e.prodCode from WallStreetcnCompanyHQ e where e.prodName like :name or e.prodCode like :code order by e.turnoverValue desc");

        query.setParameter("name", "%" + codeOrName + "%");
        query.setParameter("code", "%" + codeOrName + "%");
        query.setMaxResults(20);

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


    public List<WallStreetcnCompanyHQ> companyHq() throws Exception {
        TypedQuery<WallStreetcnCompanyHQ> query = em.createQuery("select e from WallStreetcnCompanyHQ e where e.date = :date order by e.turnoverVolume desc", WallStreetcnCompanyHQ.class);

        query.setParameter("date", new java.sql.Date(getLatestTrade().getTime()));
        query.setMaxResults(500);

        return query.getResultList();
    }
}
