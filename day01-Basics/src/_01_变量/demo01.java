package _01_变量;

/**
 * ClassName：demo01
 *
 * @author: Devil
 * @Date: 2024/7/28
 * @Description:
 * @version: 1.0
 */
public class demo01 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        a = 20;
        System.out.println(a);

        //同时定义多个变量
        int b, c, d;

        //变量赋值
        b = a;
        System.out.println(b);

        a += 20;
        System.out.println(a);
    }
}
