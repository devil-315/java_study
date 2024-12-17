package _04_String._01_基本操作;

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
        String str1 = "123";
        String str2 = "456";//常量池

        String str3 = "123456";//常量池

        String str4 = "123" + "456";//常量池

        String str5 = str1 + "456";//在堆中

        String str6 = "123" + str2;//在堆中

        String str7 = str1 + str2;//在堆中

        System.out.println(str3 == str4);

        System.out.println(str3 == str5);

        System.out.println(str3 == str6);
        System.out.println(str6 == str5);

        System.out.println(str3 == str7);

        String str8 = str5.intern();//返回值在字符串常量池中
        System.out.println(str3 == str8);
    }
}
