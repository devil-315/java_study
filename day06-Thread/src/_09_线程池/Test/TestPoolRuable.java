package _09_线程池.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName：TestPoolRuanble
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class TestPoolRuable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new MyThreadRunable());
        executorService.execute(new MyThreadRunable());
        executorService.execute(new MyThreadRunable());
        executorService.execute(new MyThreadRunable());

        //关闭
        executorService.shutdown();
    }
}
