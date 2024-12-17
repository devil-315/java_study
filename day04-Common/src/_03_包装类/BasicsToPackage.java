package _03_包装类;

/**
 * ClassName：BasicsToPackage
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
//TODO 基本数据类型==》包装类
public class BasicsToPackage {
    public static void main(String[] args) {
        //TODO 自动装箱
        int num1 = 20;
        Integer num2 = num1;
        System.out.println(num2);

        //TODO 构造器
        int num3 = 10;
        Integer integer = new Integer(num3);
        System.out.println(integer);
    }
}
