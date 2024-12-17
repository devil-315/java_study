package _09_线程池.NewFixedThreadPooltest;

/**
 * ClassName：MyNewFixedThreadPool
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class MyNewFixedThreadPool implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
