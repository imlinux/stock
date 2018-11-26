package dsy.web.dao;

import dsy.core.entity.Fdl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dong
 * @since 18-11-26
 */
@Repository
public class FdlDao extends GeneralDao {

    public List<Fdl> getAll() {
        return em.createQuery("select e from Fdl e order by e.month", Fdl.class).getResultList();
    }
}
