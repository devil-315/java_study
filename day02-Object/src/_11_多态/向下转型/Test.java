package _11_多态.向下转型;

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

        //TODO 不能调用子类特有的方法，属性，编译是，person是Person类型
        // 有了多态以后，内存中实际上是加载的子类特有的属性和方法
        // 由于变量声明为父类，导致编译时，只能调用父类的属和方法
//        person.love();

        Student student = (Student) person;
        student.grade =100;
        student.love();
    }
}
