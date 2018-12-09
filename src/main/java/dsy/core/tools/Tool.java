package dsy.core.tools;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.Closeable;
import java.util.concurrent.ThreadLocalRandom;

public class Tool {
    private static Log LOG = LogFactory.getLog(Tool.class);

    public static long pauseTime() {

        return ThreadLocalRandom.current().nextInt(1, 5) * 1000;
    }

    public static void close(Closeable...c){
        if(c != null) {
            for(Closeable a: c) {
                if(a != null) {
                    try {
                        a.close();
                    } catch (Exception e) {
                        LOG.error("", e);
                    }
                }
            }
        }
    }

    public static void close(AutoCloseable ...c){
        if(c != null){
            for(AutoCloseable a: c) {
                if(a != null) {
                    try {
                        a.close();
                    } catch (Exception e) {
                        LOG.error("", e);
                    }
                }
            }
        }
    }
}
