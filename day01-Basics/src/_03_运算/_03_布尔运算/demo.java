package _03_运算._03_布尔运算;

/**
 * ClassName：demo
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo {
    public static void main(String[] args) {
        boolean flag = 5>3; //true
        System.out.println(flag);

        int age =16;
        boolean isAdult = age>= 18; //false
        System.out.println(isAdult);

        boolean NoAdult = !isAdult;
        System.out.println(NoAdult);//true

        boolean flag02 = age > 12 && age < 18;
        System.out.println(flag02);
    }
}
