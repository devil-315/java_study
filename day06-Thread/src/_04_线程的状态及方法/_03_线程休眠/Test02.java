package _04_线程的状态及方法._03_线程休眠;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName：Test02
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date(System.currentTimeMillis());

        while (true){
            String format = new SimpleDateFormat("HH:mm:ss").format(date);
            System.out.println(format);
            Thread.sleep(1000);
            date = new Date(System.currentTimeMillis());
        }
    }
}
