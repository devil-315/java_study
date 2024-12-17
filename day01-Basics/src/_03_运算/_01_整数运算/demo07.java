package _03_运算._01_整数运算;

/**
 * ClassName：demo07
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo07 {
    public static void main(String[] args) {
        //TODO 将范围大的类型强制转换为范围小的类型
        short s = 12345;
        int n = 12345;
        short result = (short) (s + n);

        double d = 3.14;
        short result02 = (short) (s + n + d);


        //TODO byte 变量进行相加的时候
        byte b1 = 1;
        byte b2 = 2;

        byte result03 = (byte) (b1 + b2);
    }
}
