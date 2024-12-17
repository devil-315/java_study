package _03_运算._02_浮点数运算;

/**
 * ClassName：demo02
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo02 {
    public static void main(String[] args) {
        //整数 除数为0 会报错
//        int n = 10/0;
//        System.out.println(n);

        double d1 = 0.0 / 0;
        double d2 = 1.0 / 0;
        double d3 = -1.0 /0;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        int n1 = (int) 12.3;
        int n2 = (int) -12.3;
        int n3 = (int) (12.3 + 0.5);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
