package _11_多态.为什么需要多态;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.func(new Dog());
        test.func(new Cat());
    }
    public void func(Animal animal){   // Animal animal = new Dog()
        animal.call();
        animal.eat();
    }
}
