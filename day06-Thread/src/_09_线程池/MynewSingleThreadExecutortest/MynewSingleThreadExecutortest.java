package _09_线程池.MynewSingleThreadExecutortest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName：MyNewSingleThreadPooltest
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class MynewSingleThreadExecutortest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MynewSingleThreadExecutor());
        }
        executorService.shutdown();
    }
}
