package dsy.web.dao;

import dsy.web.dto.BuffettRationTo;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dong
 * @since 18-11-17
 */
@Repository
public class GpjytjDao extends GeneralDao {

    public List<BuffettRationTo> buffettRatio() {

        String sql = "SELECT\n" +
                "    date, mktVal, gdp\n" +
                "FROM\n" +
                "    (\n" +
                "        SELECT\n" +
                "            DATE,\n" +
                "            SUBSTRING(DATE, 1, 4) YEAR,\n" +
                "            SUM(mktVal)           mktVal\n" +
                "        FROM\n" +
                "            gpjytj\n" +
                "        WHERE\n" +
                "            mktVal !=0\n" +
                "        GROUP BY\n" +
                "            DATE) t1\n" +
                "LEFT JOIN\n" +
                "    (\n" +
                "        SELECT\n" +
                "            quarter,\n" +
                "            REPLACE(quarter, '.4', '') YEAR,\n" +
                "            gdp\n" +
                "        FROM\n" +
                "            gdp\n" +
                "        WHERE\n" +
                "            quarter LIKE '%.4') t2\n" +
                "ON\n" +
                "    t1.year=t2.year";

        Query query = em.createNativeQuery(sql);

        List<BuffettRationTo> ret = new ArrayList<>();

        for (Object e: query.getResultList()) {

            Object[] arr = (Object[]) e;

            BuffettRationTo b = new BuffettRationTo();

            b.setDate((String) arr[0]);
            b.setMktVal((double) arr[1]);

            if(arr[2] != null) b.setGdp((double) arr[2]);

            ret.add(b);
        }

        return ret;
    }
}
