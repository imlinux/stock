package dsy.web.dao;

import dsy.core.entity.PMI;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dong
 * @since 18-11-27
 */
@Repository
public class PmiDao extends GeneralDao {

    public List<PMI> getAll() {

        return em.createQuery("select e from PMI e order by e.month", PMI.class).getResultList();
    }
}
