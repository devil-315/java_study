package Test9;

/**
 * ClassName：Tick
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class Tick {
    private static int count =25;
    public synchronized static void sell(){
        if(count > 0){
            System.out.println(Thread.currentThread().getName() + "出售一张票，剩余：" + --count);
        }else {
            System.out.println("已经卖完了");
        }
    }

    public static void main(String[] args) {
        new Thread(() -> {
            while (count > 0){
                sell();
            }
        },"窗口1").start();

        new Thread(() -> {
            while (count > 0){
                sell();
            }
        },"窗口2").start();

        new Thread(() -> {
            while (count > 0){
                sell();
            }
        },"窗口3").start();

    }
}
