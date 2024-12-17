package _11_多态.为什么需要多态;

/**
 * ClassName：Cat
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Cat extends Animal{
    @Override
    public void call() {
        System.out.println("猫叫");
    }

    @Override
    public void eat() {
        System.out.println("鱼");
    }
}
