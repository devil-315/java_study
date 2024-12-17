package Test12;

/**
 * ClassName：test1
 *
 * @author: Devil
 * @Date: 2024/8/23
 * @Description:
 * @version: 1.0
 */
public class test1 {
    public static void main(String[] args) {
        Coordinate<String> x = new Coordinate<>("haha","lili");
        Coordinate<Double> y = new Coordinate<>(2.5,2.5);

        System.out.println("X:" + x.getX() + "," +x.getY());
        System.out.println("Y:" + y.getX() + "," +y.getY());
    }
}
