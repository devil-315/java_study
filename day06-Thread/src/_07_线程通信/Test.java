package _07_线程通信;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Storage storage = new Storage();
        new Thread(new Prodeucer(storage),"p1").start();
        new Thread(new Comsumer(storage),"c1").start();
    }
}
