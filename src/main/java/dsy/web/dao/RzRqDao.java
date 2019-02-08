package dsy.web.dao;

import dsy.core.entity.EastMoneyRzrq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dong
 * @since 18-11-2
 */
@Repository
public interface RzRqDao extends JpaRepository<EastMoneyRzrq, String> {
}
