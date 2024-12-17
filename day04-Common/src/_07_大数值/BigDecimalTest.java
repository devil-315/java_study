package _07_大数值;
import java.math.BigDecimal;
/**
 * ClassName：BigDecimal
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("32454646846");
        BigDecimal bigDecimal2 = new BigDecimal("456789123");

        System.out.println("加法："+bigDecimal1.add(bigDecimal2));

        BigDecimal[] bigDecimals = bigDecimal1.divideAndRemainder(bigDecimal2);
        System.out.println(bigDecimals[0]);
        System.out.println(bigDecimals[1]);


    }
}
