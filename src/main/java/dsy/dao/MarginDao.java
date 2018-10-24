package dsy.dao;

import dsy.dto.HSMargin;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dong
 * @since 18-10-23
 */
@Repository
public class MarginDao {

    @PersistenceContext
    EntityManager em;

    public List<HSMargin> findAll() {
        String sql = "SELECT\n" +
                "    tradeDate, v/gdp/100000000*100\n" +
                "FROM\n" +
                "    (\n" +
                "        SELECT\n" +
                "            tradeDate,\n" +
                "            YEAR(tradeDate) YEAR,\n" +
                "            SUM(tradeVal) v\n" +
                "        FROM\n" +
                "            fst_total_get\n" +
                "        GROUP BY\n" +
                "            tradeDate ) t1\n" +
                "JOIN\n" +
                "    gdp_year t2\n" +
                "ON\n" +
                "    t1.year=t2.year";
        List<Object[]> l = em.createNativeQuery(sql).getResultList();

        List<HSMargin> ret = new ArrayList<>();

        for(Object[] e: l) {
            HSMargin rec = new HSMargin();

            rec.setTradeDate((String) e[0]);
            rec.setTradeValGdp((Double) e[1]);

            ret.add(rec);
        }

        return ret;
    }
}
