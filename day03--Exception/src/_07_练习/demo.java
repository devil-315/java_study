package _07_练习;

import java.util.Scanner;

/**
 * ClassName：demo
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class demo {
    public static void main(String[] args) {
        try {
            System.out.println("输入一个整数");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            int i = Integer.parseInt(s);
            if (i < 0) {
                throw new NegativeNumberException("输入的是一个复数");
            }
            System.out.println("输入的是:"+i);
        } catch (NegativeNumberException e) {
            throw new RuntimeException(e);
        }
    }
}
