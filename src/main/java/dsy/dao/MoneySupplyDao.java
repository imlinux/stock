package dsy.dao;

import dsy.entity.MoneySupply;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author dong
 * @since 18-10-23
 */
@Repository
public class MoneySupplyDao {

    @PersistenceContext
    EntityManager em;

    public List<MoneySupply> getAll() {
        return em.createQuery("select t from MoneySupply t where t.month > '2006.8' order by t.month", MoneySupply.class).getResultList();
    }
}
