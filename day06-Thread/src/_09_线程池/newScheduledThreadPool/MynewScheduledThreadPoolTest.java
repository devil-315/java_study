package _09_线程池.newScheduledThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ClassName：MynewScheduledThreadPoolTest
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class MynewScheduledThreadPoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        MynewScheduledThreadPool mynewScheduledThreadPool1 = new MynewScheduledThreadPool();
        scheduledExecutorService.execute(mynewScheduledThreadPool1);

        MynewScheduledThreadPool mynewScheduledThreadPool2 = new MynewScheduledThreadPool();
        scheduledExecutorService.execute(mynewScheduledThreadPool2);

        scheduledExecutorService.schedule(mynewScheduledThreadPool1,1000, TimeUnit.MICROSECONDS);
        scheduledExecutorService.shutdown();
    }
}
