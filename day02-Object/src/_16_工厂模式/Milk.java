package _16_工厂模式;

/**
 * ClassName：Milk
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */
public class Milk implements Food{

    @Override
    public void eat() {
        System.out.println("牛奶");
    }
}
