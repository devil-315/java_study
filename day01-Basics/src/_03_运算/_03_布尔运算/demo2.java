package _03_运算._03_布尔运算;

/**
 * ClassName：demo2
 *
 * @author: Devil
 * @Date: 2024/7/29
 * @Description:
 * @version: 1.0
 */
public class demo2 {
    public static void main(String[] args) {
        //TODO 注意： 三元表达式，结果不一定是 布尔值
        int n = -10;
        int result = n>0?n:-n;
        System.out.println(result);
    }
}
