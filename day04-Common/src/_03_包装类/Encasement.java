package _03_包装类;

/**
 * ClassName：Encasement
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class Encasement {
    public static void main(String[] args) {
        //TODO 基本数据类型 ==》 包装类 装箱
        int num1 = 20;
        Integer num2 = num1; //自动装箱

        boolean b1 = true;
        Boolean b2 = b1; //自动装箱

        //TODO 包装类 ==》基本数据类型 拆箱

        int num3 = num2; // 自动拆箱
    }
}
