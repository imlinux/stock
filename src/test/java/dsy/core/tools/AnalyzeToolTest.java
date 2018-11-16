package dsy.core.tools;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author dong
 * @since 18-11-16
 */
public class AnalyzeToolTest {

    @Test
    public void route() {


        Map<String, Object> m1 = new HashMap<>();
        m1.put("a", 1);
        m1.put("b", 2);
        m1.put("c", 3);
        m1.put("d", 4);

        Map<String, Object> m2 = new HashMap<>(m1);

        Map<String, Object> m3 = new HashMap<>(m1);

        Map<String, Object> m4 = new HashMap<>(m1);
        m4.remove("b");

        List l = new ArrayList();

        l.add(m1);
        l.add(m2);
        l.add(m3);
        l.add(m4);

        System.out.println(AnalyzeTool.route(l));
    }
}