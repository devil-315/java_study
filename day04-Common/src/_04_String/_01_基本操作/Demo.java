package _04_String._01_基本操作;

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
        //TODO 字面量的方式 存储在字符串常量池中
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1 == str2);

        str1 = "456";
        System.out.println(str1 == str2);

        String  str3 = "abc";
        str3 += "def";
        System.out.println(str3);

        String  str4 = "123";
        String str5 = str4.replace("1","a");
        System.out.println(str4);
        System.out.println(str5);
    }
}
