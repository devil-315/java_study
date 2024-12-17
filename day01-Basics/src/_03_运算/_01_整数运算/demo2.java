package _03_运算._01_整数运算;

/**
 * ClassName：demo2
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo2 {
    public static void main(String[] args) {
        int a = 2147483640;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);

        //解决 改成long
        long a2 = 2147483640;
        long b2 = 10;
        long sum02 = a2 + b2;
        System.out.println(sum02);
    }
}
