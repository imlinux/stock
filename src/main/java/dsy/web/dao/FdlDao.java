package dsy.web.dao;

import dsy.core.entity.Fdl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author dong
 * @since 18-11-26
 */
public interface FdlDao extends JpaRepository<Fdl, String> {

    @Query("select e from Fdl e order by e.month")
    List<Fdl> getAll();
}
