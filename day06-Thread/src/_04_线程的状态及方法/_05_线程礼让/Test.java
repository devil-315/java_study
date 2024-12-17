package _04_线程的状态及方法._05_线程礼让;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test implements Runnable{
    public static void main(String[] args) {
        Test test = new Test();
        Thread a = new Thread(test, "A");
        Thread b = new Thread(test, "B");

        a.start();
        b.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "====>" + i);

            if (i == 3){
                System.out.println("礼让");
                    Thread.yield();
            }
        }
    }
}
