package dsy.web.dao;

import dsy.core.entity.PMI;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dong
 * @since 18-11-27
 */
public interface PmiDao extends JpaRepository<PMI, String> {
}
