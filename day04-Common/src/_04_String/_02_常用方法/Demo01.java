package _04_String._02_常用方法;

/**
 * ClassName：Demo01
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        String str = "abcDEF";
        System.out.println(str.length());
        System.out.println(str.charAt(3));

        System.out.println(str.isEmpty());

        String s = str.toLowerCase();
        System.out.println(s);

        String str2 = "        qwert  qwer    ";
        String trim = str2.trim();
        System.out.println(trim);

        String str3 = "abCdEf";
        System.out.println(str.equals(str3));
        System.out.println(str.equalsIgnoreCase(str3));

        String substring = str3.substring(1);
        System.out.println(substring);

        //[1,4) ==> [1,3]
        String substring1 = str3.substring(1, 4);
        System.out.println(substring1);

        String str4 = "devil";
        String concat = str3.concat(str4);
        System.out.println(concat);
    }
}
