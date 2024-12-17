package _09_线程池.newScheduledThreadPool;

/**
 * ClassName：MynewScheduledThreadPool
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class MynewScheduledThreadPool implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
