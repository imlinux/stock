package dsy.web.dao;

import dsy.core.entity.MarketType;
import dsy.core.entity.WallStreetCnHq;
import dsy.web.dto.SearchCompany;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

import static dsy.core.tools.TradeTool.getLatestTradeStr;

/**
 * @author dong
 * @since 18-11-1
 */
@Repository
public class WallStreetCnHqDao extends GeneralDao {

    /**
     * 根据关键字和代码搜索股票，
     * @param codeOrName
     * @return 结果按时间和成交额逆序排序
     */
    public List<SearchCompany> searchCompany(String codeOrName) {

        Query query = em.createQuery("select distinct e.prodName, e.prodCode, e.turnoverValue, e.date from WallStreetCnHq e where (e.prodName like :name or e.prodCode like :code ) and e.marketType = :type order by e.date desc, e.turnoverValue desc");

        query.setParameter("name", "%" + codeOrName + "%");
        query.setParameter("code", "%" + codeOrName + "%");
        query.setParameter("type", MarketType.Stock);
        query.setMaxResults(20);

        List<Object[]> l = query.getResultList();
        List<SearchCompany> ret = new ArrayList<>();

        for(Object[] e: l) {
            SearchCompany rec = new SearchCompany();

            rec.setName((String) e[0]);
            rec.setCode((String) e[1]);
            ret.add(rec);
        }


        return ret;
    }


    /**
     * 获取最新个股行情列表
     * @return
     * @throws Exception
     */
    public List<WallStreetCnHq> getLatestCompanyHq() throws Exception {
        TypedQuery<WallStreetCnHq> query = em.createQuery("select e from WallStreetCnHq e where e.date = :date and e.marketType = :type order by e.turnoverVolume desc", WallStreetCnHq.class);

        query.setParameter("date", getLatestTradeStr());
        query.setParameter("type", MarketType.Stock);
        query.setMaxResults(500);

        return query.getResultList();
    }

    /**
     * 获取外汇行情列表
     * @param date
     * @return
     * @throws Exception
     */
    public List<WallStreetCnHq> getLatestWhHq(String date) throws Exception {

        TypedQuery<WallStreetCnHq> query = em.createQuery("select e from WallStreetCnHq e where e.date = :date and e.marketType = :type", WallStreetCnHq.class);

        query.setParameter("date", date);
        query.setParameter("type", MarketType.ForeignData);

        return query.getResultList();
    }

    /**
     * 获取所有债券行情
     * @return
     * @throws Exception
     */
    public List<WallStreetCnHq> getAllBond() throws Exception {
        TypedQuery<WallStreetCnHq> query = em.createQuery("select e from WallStreetCnHq e where e.marketType = :type order by e.date", WallStreetCnHq.class);
        query.setParameter("type", MarketType.Bond);

        return query.getResultList();
    }
}
