package _11_多态.基本使用;

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
        //对象的多态：父类的引用，指向子类的对象
        Person person = new Student();
        //调用父类的同名方法，实际上调用的是 子类重写父类的方法
        person.eat();
        person.play();

        //TODO 无法调用子类自己的方法==》编译期只能调用父类声明的方法，执行的是子类重写父类的方法
//        person.love();
    }
}
