package _04_线程的状态及方法._08_守护进程;

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
            Thread userThread = new Thread(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for (int i = 0; i < 10; i++) {
                    if (i == 9) {
                        System.out.println(Thread.currentThread().getName() + "逝世" + i);
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "还活着" + i);
                }
            },"主将");

            Thread daemonThread = new Thread(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for (int i = 0; i < 100000; i++) {
                    System.out.println(Thread.currentThread().getName() + "守护" + i);
                }
            }, "士兵");


            //TODO 设置守护线程
            daemonThread.setDaemon(true);

            userThread.start();
            daemonThread.start();
        }
}
