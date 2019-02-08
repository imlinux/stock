package dsy.web.dao;

import dsy.core.entity.IndustryHQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author dong
 * @since 18-11-1
 */
public interface IndustryDao extends JpaRepository<IndustryHQ, String> {


    List<IndustryHQ> findByDate(String date);

    @Query("select max(e.date) from IndustryHQ e")
    String getLatestTradeDate();
}
