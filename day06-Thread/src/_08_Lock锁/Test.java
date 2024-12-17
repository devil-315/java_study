package _08_Lock锁;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Test implements Runnable{
    private int Ticket = 10;

    //实例化
    private ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            //调用锁定方法
            try {
                reentrantLock.lock();
                if (this.Ticket > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "出售一张票，剩余" + --this.Ticket + "张票");
                } else {
                    System.out.println("没票了");
                    break;
                }
            }finally {
                //解锁
                reentrantLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        new Thread(test,"窗口1").start();
        new Thread(test,"窗口2").start();
        new Thread(test,"窗口3").start();

    }
}
