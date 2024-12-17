package _01_线程创建;

import java.util.concurrent.*;

/**
 * ClassName：CallableTest
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class CallableTest implements Callable {
    @Override
    public Object call() throws Exception {
        for(int i = 0;i < 20; i++){
            System.out.println(Thread.currentThread().getName() + "====>" + i);
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTest callableTestA = new CallableTest();
        CallableTest callableTestB = new CallableTest();
        CallableTest callableTestC = new CallableTest();

        //创建执行服务
        //创建一个固定大小的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //提交服务
        Future<Boolean> submit1 = executorService.submit(callableTestA);
        Future<Boolean> submit2 = executorService.submit(callableTestB);
        Future<Boolean> submit3 = executorService.submit(callableTestC);

        //获取结果
        Boolean f1 = submit1.get();
        Boolean f2 = submit2.get();
        Boolean f3 = submit3.get();

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        //关闭服务
        executorService.shutdown();
    }
}
