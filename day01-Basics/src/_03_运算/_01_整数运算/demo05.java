package _03_运算._01_整数运算;

/**
 * ClassName：demo05
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo05 {
    public static void main(String[] args) {
        //TODO 与运算，有假必假
        System.out.println(true & true);
        System.out.println(true & false);

        System.out.println(0 & 0);//0
        System.out.println(0 & 1);//0
        System.out.println(1 & 1);//1
        System.out.println(1 & 0);//0

        //TODO 或运算 有真必真
        System.out.println(0 | 0);//0
        System.out.println(1 | 0);//1
        System.out.println(0 | 1);//1
        System.out.println(1 | 1);//1

        //TODO 非运算，取反
        System.out.println(!true);
        System.out.println(!false);

        //TODO 异或运算 两个数不同，结果是1
        System.out.println(1 ^ 0);//1
        System.out.println(1 ^ 1);//0
        System.out.println(0 ^ 0);//0
        System.out.println(0 ^ 1);//1
    }
}
