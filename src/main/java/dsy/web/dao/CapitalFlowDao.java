package dsy.web.dao;

import dsy.core.entity.CapitalFlow;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author dong
 * @since 18-11-16
 */
public interface CapitalFlowDao extends JpaRepository<CapitalFlow, String> {

    /**
     * 获取个股每天资金流
     * @param code
     * @return
     */
    List<CapitalFlow> findByCode(String code, Sort sort);
}
