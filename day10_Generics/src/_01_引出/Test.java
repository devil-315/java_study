package _01_引出;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Site site = new Site();
        site.setA(10);
        site.setB(20);
        int a =(Integer) site.getA();
        int b = (Integer) site.getB();
        System.out.println(a + b);
    }
}
