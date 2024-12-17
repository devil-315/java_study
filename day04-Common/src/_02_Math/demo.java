package _02_Math;

/**
 * ClassName：demo
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class demo {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(-10));

        //获取最大值
        System.out.println(Math.max(10.2, 10.3));

        //对数运算
        System.out.println(Math.log(5));

        //四舍五入
        System.out.println(Math.round(15.1));
        //-15
        System.out.println(Math.round(-15.5));
        System.out.println(Math.pow(2, 2));

        //开平方
        System.out.println(Math.sqrt(9));

        //向上取整
        System.out.println(Math.ceil(9.1));
        //向下取整
        System.out.println(Math.floor(9.9));

        System.out.println(Math.random());
    }
}
