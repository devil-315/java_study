package _03_运算._03_布尔运算;

/**
 * ClassName：demo03
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo03 {
    public static void main(String[] args) {
        boolean flag =10 < 3;

        //TODO 短路与，如果前面结果是false，后面不再运算
        boolean result = flag && (10/0 > 0);
        System.out.println(result);

        //TODO 逻辑与 前后都运算
        boolean result02 = flag & (10/0>0);
    }
}
