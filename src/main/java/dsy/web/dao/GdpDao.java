package dsy.web.dao;

import dsy.core.entity.Gdp;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author dong
 * @since 18-10-22
 */
@Repository
public class GdpDao extends GeneralDao {

    public List<Gdp> findAll() {

        Query query = em.createQuery("select g from Gdp g where g.quarter like '%.4' order by g.quarter");

        return query.getResultList();
    }

    //TODO 自动获取最新的时间
    public Gdp getLatestGdp() {
        TypedQuery<Gdp> query = em.createQuery("select t from Gdp t where t.quarter='2017.4'", Gdp.class);

        return query.getSingleResult();
    }
}
