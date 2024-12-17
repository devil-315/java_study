package Test7;

import java.util.Scanner;

/**
 * ClassName：test1
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class test1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数");
            int num = scanner.nextInt();
            if(num < 0){
                throw  new NegativeNumberException("输入的是一个负数");
            }
            System.out.println("输入的是：" + num);
        } catch (NumberFormatException e) {
            System.out.println("输入无效");
        } catch (NegativeNumberException e) {
            throw new RuntimeException(e);
        }
    }
}
