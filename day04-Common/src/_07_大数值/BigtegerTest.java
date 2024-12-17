package _07_大数值;

import java.math.BigInteger;

/**
 * ClassName：BigtegerTest
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class BigtegerTest {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("123456789123456789");
        BigInteger bigInteger2 = new BigInteger("123456789");
        System.out.println("加法："+ bigInteger1.add(bigInteger2));
        System.out.println("减法："+ bigInteger1.subtract(bigInteger2));
        System.out.println("除法："+ bigInteger1.multiply(bigInteger2));
        System.out.println("乘法："+ bigInteger1.divide(bigInteger2));


    }
}
