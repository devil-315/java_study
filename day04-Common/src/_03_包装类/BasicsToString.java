package _03_包装类;

import javax.management.StringValueExp;

/**
 * ClassName：BasicsToString
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
//TODO 基本数据类型、包装类 ==》 String 调用String类的ValueOf(xxx)
public class BasicsToString {
    public static void main(String[] args) {
        //TODO 基本数据类型==》String
        int num1 = 10;
        //TODO 方式一
        String  str1 = num1 + "";
        System.out.println(num1);

        //TODO 方式二: 调用ValueOf(xxx)
        String str2 = String.valueOf(num1);
        System.out.println(str2);

        double d = 3.14;
        String str3 = String.valueOf(d);
        System.out.println(str3);

        //TODO 包装类 ==》String
        Integer num2 = 10;
        String str4 = String.valueOf(num2);
        System.out.println(str4);

        Double d2 = 3.14;
        String str5 = String.valueOf(d2);
        System.out.println(str5);
    }
}
