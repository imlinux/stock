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
        List<Object[]> l = em.createQuery("select m.tradeDate, sum(m.finVal), sum(m.tradeVal) from Margin m group by m.tradeDate", Object[].class).getResultList();

        List<HSMargin> ret = new ArrayList<>();

        for(Object[] e: l) {
            HSMargin rec = new HSMargin();

            rec.setTradeDate((String) e[0]);
            rec.setFinVal((long) e[1]);
            rec.setTradeVal((long) e[2]);

            ret.add(rec);
        }

        return ret;
    }
}
