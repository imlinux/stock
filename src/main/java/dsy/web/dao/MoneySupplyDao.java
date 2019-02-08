package dsy.web.dao;

import dsy.core.entity.MoneySupply;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author dong
 * @since 18-10-23
 */
public interface MoneySupplyDao extends JpaRepository<MoneySupply, String> {
}
