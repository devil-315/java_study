package _09_线程池.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ClassName：TestPoolRuanble
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class TestPoolCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future submit1 = executorService.submit(new MyCallable());
        Future submit2 = executorService.submit(new MyCallable());
        Future submit3 = executorService.submit(new MyCallable());
        Future submit4 = executorService.submit(new MyCallable());

        System.out.println(submit1.get());
        System.out.println(submit2.get());
        System.out.println(submit3.get());
        System.out.println(submit4.get());

        executorService.shutdown();
    }
}
