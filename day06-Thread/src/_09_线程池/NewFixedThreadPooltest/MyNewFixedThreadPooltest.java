package _09_线程池.NewFixedThreadPooltest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName：MyNewFixedThreadPooltest
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class MyNewFixedThreadPooltest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyNewFixedThreadPool());
        }
        executorService.shutdown();
    }
}
