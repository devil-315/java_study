package _04_线程的状态及方法._04_强制执行;

import _04_线程的状态及方法._03_线程休眠.Test;

/**
 * ClassName：Test01
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        //主线程
        Thread main = Thread.currentThread();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    if(i == 10){
                        main.join();
                    }
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "==抢了" + i + "次");
            }
        });

        thread.start();
        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            System.out.println("霸道的曹贼" + "抢了"+i + "次");
        }
    }
}
