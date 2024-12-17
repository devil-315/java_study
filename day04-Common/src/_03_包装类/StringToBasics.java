package _03_包装类;

/**
 * ClassName：StringToBasics
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
//TODO String ==> 基本数据类型、包装类  调用包装类的 parexxx()
public class StringToBasics {
    public static void main(String[] args) {
        String str1 = "123";

        //报错
//        int num1 = (int)str1;

        //TODO String ==> Integer
        Integer num1 = Integer.parseInt(str1);
        System.out.println(num1);

        //TODO String ==> int
        int num2 = Integer.parseInt(str1);
        System.out.println(num2);

        //TODO String == >Boolean
        String  str3 = "true";
        Boolean b1 = Boolean.parseBoolean(str3);

        boolean b2 = Boolean.parseBoolean(str3);
        System.out.println(b1);
        System.out.println(b2);
    }
}
