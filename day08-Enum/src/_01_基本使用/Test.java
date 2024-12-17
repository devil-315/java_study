package _01_基本使用;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Color red = Color.RED;
        System.out.println(red);

        for (Color color: Color.values()) {
            System.out.println(color);
        }
    }
}
