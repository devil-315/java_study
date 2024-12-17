package _02_基本数据类型;

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
        //整形
        int a = 12345;

        //浮点型
        float f = 3.14f;
        double d = 3.14f;

        //布尔类型
        boolean b1 =true;
        boolean b2 = false;

        //运算
        boolean flag = 5>3; //true
        System.out.println(flag);

        int age =16;
        boolean isAdult = age>= 18; //false
        System.out.println(isAdult);

        //字符
        char c ='A';
        char zh = '你';
        System.out.println(c);
        System.out.println(zh);

        //TODO 常量，使用final修饰符
        final double PI = 3.14;
        double r = 5.5;
        double area = PI * r * r;
        System.out.println(area);

        // TODO 常量不能重新赋值
        //PI = 6.5;
    }
}
