package _03_运算._01_整数运算;

/**
 * ClassName：demo04
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo04 {
    public static void main(String[] args) {
        int n = 7; // 00000000 00000000 00000000 00000111 = 7
        //TODO 左位移
        int n2 = n << 1; // 14 00000000 00000000 00000000 00001110 = 14
        int n3 = n << 2; //28 00000000 00000000 00000000 000011100 = 28

        System.out.println(n2);
        System.out.println(n3);

        //TODO 右位移
        int n4 = n >> 1; // 00000000 00000000 00000000 00000011 = 3
        int n5 = n >> 2; // 00000000 00000000 00000000 00000001 = 1

        System.out.println(n4);
        System.out.println(n5);

        int n6 = -536870912;
        //TODO 无符号右位移
        int n7 = n6 >>> 1;
        System.out.println(n7);
    }
}
