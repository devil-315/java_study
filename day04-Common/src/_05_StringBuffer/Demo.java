package _05_StringBuffer;

/**
 * ClassName：Demo
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        StringBuffer devil = new StringBuffer("devil");
        devil.append(1);
        devil.append("2");
        System.out.println(devil);

        devil.delete(2,4);
        System.out.println(devil);

        devil.insert(2,false);
        System.out.println(devil);
        System.out.println(devil.reverse());
    }
}
