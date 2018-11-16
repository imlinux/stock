package dsy.core.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dong
 * @since 18-11-16
 */
public class AnalyzeTool {

    public static Map<String, List> route(List<Map<String, Object>> data) {

        Map<String, List> ret = new HashMap<>();

        if(data != null) {

            for(Map<String, Object> e: data) {

                for(Map.Entry<String, Object> ee: e.entrySet()) {

                    List l = ret.get(ee.getKey());

                    if(l == null) {
                        ret.put(ee.getKey(), new ArrayList());
                        l = ret.get(ee.getKey());
                    }

                    l.add(ee.getValue());
                }
            }
        }

        return ret;
    }
}
