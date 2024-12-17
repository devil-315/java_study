package _16_工厂模式;

/**
 * ClassName：Bread
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */
public class Bread implements Food{
    @Override
    public void eat() {
        System.out.println("面包");
    }
}
