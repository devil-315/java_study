package 饿汉式;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        Sington instance = Sington.getINSTANCE();
        System.out.println(instance);

        Sington instance1 = Sington.getINSTANCE();
        System.out.println(instance1);
        System.out.println(instance1 == instance);
    }
}
