package Test5;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        changfangx hcangfangx = new changfangx(4, 5);
        yuan yuan = new yuan(2);
        System.out.println("长方形的周长："+hcangfangx.perimeter());
        System.out.println("长方形的面积："+hcangfangx.area());
        System.out.println("正方形的周长："+yuan.perimeter());
        System.out.println("正方形的面积："+yuan.area());

    }
}
