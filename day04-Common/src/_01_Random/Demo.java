package _01_Random;

import java.util.Random;

/**
 * ClassName：Demo
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0;i<10;i++){
            System.out.println(random.nextInt());
            System.out.println("====================");
            System.out.println(random.nextInt(10));
        }
    }
}
