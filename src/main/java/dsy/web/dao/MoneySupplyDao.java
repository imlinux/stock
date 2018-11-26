package dsy.web.dao;

import dsy.core.entity.MoneySupply;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dong
 * @since 18-10-23
 */
@Repository
public class MoneySupplyDao extends  GeneralDao {

    public List<MoneySupply> getAll() {
        return em.createQuery("select t from MoneySupply t where t.month > '2006.8' order by t.id", MoneySupply.class).getResultList();
    }
}
