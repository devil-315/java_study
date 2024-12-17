package _03_throws关键字;

/**
 * ClassName：test02
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class test02 {
    public static void main(String[] args) {
        try {
            Demo.div(9,3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
