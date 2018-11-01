package dsy.web.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author dong
 * @since 18-11-1
 */
public class GeneralDao {

    @PersistenceContext
    protected EntityManager em;


    public <T> T merge(T entity) {
        return em.merge(entity);
    }

    public <T> T find(Class<T> clazz, Object primaryKey) {
        return em.find(clazz, primaryKey);
    }
}
