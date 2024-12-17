package _03_运算._01_整数运算;

/**
 * ClassName：demo06
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo06 {
    public static void main(String[] args) {
        //TODO 在运算过程中，如果参与运算的两个类型不一致，那么计算结果为范围较大的类型
        short s = 12345;
        int n = 12345;
//        short result = n + s;
        int result = n + s;

        double d = 3.14;
        double result02 = s + n + d;

        int n2 = 45678;
        int result03 = n + n2;

        //TODO byte 变量进行相加的时候
        byte b1 = 1;
        byte b2 = 2;
//        byte result04 = b1 + b2;//编译报错，byte变量相加，自动升级为int
    }
}
