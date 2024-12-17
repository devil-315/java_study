package _03_包装类;

/**
 * ClassName：PackageToBasics
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
//TODO  包装类 ==》 基本数据类型
public class PackageToBasics {
    public static void main(String[] args) {
        //自动拆箱
        Integer num1 = 10;
        int num2 = num1;

        Boolean b1 = true;
        boolean b2 = b1;

        //TODO 调用xxxValue()
        Integer num3 = new Integer(20);
        int num4 = num3.intValue();
        System.out.println(num4);

        Boolean b3 = new Boolean(true);
        boolean b4 = b3.booleanValue();
        System.out.println(b4);
    }
}
