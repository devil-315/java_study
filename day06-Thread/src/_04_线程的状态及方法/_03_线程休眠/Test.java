package _04_线程的状态及方法._03_线程休眠;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        int num = 10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if(num <= 0){
                break;
            }
        }
    }
}
