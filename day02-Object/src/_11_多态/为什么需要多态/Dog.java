package _11_多态.为什么需要多态;

/**
 * ClassName：Dog
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Dog extends Animal{
    @Override
    public void call() {
        System.out.println("狗叫");
    }

    @Override
    public void eat() {
        System.out.println("肉");
    }
}
