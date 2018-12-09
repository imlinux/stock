package dsy.core.tools;

import java.util.concurrent.ThreadLocalRandom;

public class Tool {

    public static long pauseTime() {

        return ThreadLocalRandom.current().nextInt(1, 5) * 1000;
    }
}
