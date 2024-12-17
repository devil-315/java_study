package _03_运算._02_浮点数运算;

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
        double x = 1.0/10; //0.1
        double y = 1 - 9.0/10;
        System.out.println(x);
        System.out.println(y);

        double result = Math.abs(x - y);
        if (result < 0.000001){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }
}
