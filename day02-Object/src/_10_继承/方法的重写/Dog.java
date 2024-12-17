package _10_继承.方法的重写;

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
}
