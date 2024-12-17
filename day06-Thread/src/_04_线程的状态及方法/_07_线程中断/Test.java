package _04_线程的状态及方法._07_线程中断;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "执行");
            }
        };

        Thread threada = new Thread(runnable, "A");
        Thread threadb = new Thread(runnable, "B");
        Thread threadc = new Thread(runnable, "C");

        threada.setPriority(Thread.MIN_PRIORITY);
        threadb.setPriority(Thread.MIN_PRIORITY);
        threadc.setPriority(Thread.MAX_PRIORITY);

        threada.start();
        threadb.start();
        threadc.start();

    }
}
