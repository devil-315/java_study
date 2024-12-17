package _03_包装类;

/**
 * ClassName：IntegerTest
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */

//TODO Interger的范围是-128~127
public class IntegerTest {
    public static void main(String[] args) {
        Integer x1 = 99;
        Integer y1 = 99;
        System.out.println(x1 == y1);//true

        Integer x2 = 128;
        Integer y2 = 127;
        System.out.println(x2 == y2);//false

        Integer x4 = new Integer(127);
        Integer y4 = new Integer(127);
        //TODO  比较的是地址
        System.out.println(x4 == y4);//false
        System.out.println(x4.equals(y4));//true

        Integer x5 = 128;
        Integer y5 = 128;
        System.out.println(x5==y5);//false
        System.out.println(x5.equals(y5));//true

        Integer x6 = 127;
        Integer y6 = new Integer(127);
        System.out.println(x6==y6);//false
        System.out.println(x6.equals(y6));//true
    }
}
