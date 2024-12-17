package _03_运算._01_整数运算;

/**
 * ClassName：demo03
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo03 {
    public static void main(String[] args) {
        int a =33;
        a++;
        System.out.println(a);

        a--;
        System.out.println(a);

        //TODO ++在前面，先自增，在运算
        int b = 100 + (++a);
        System.out.println(b);
        System.out.println(a);

        //TODO ++在后面，先运算，再自增
        int c =33;
        int d = 100 + (c++);
        System.out.println(d);
        System.out.println(c);
    }
}
