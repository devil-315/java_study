package _04_String._02_常用方法;

/**
 * ClassName：Demo02
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        String str = "helloworld";
        boolean rld = str.endsWith("rld");
        System.out.println(rld);

        boolean he = str.startsWith("he");
        System.out.println(he);

        boolean ow = str.startsWith("ow", 4);
        System.out.println(ow);

        String str2 = "www";
        System.out.println(str.contains(str2));

        int o = str.indexOf("o");
        System.out.println(o);

        int o1 = str.indexOf("o", 5);
        System.out.println(o1);

        int o2 = str.lastIndexOf("o");
        System.out.println(o2);

        int o3 = str.lastIndexOf("o", 5);
        System.out.println(o3);
    }
}
