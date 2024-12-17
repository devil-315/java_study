package _01_基本使用;

/**
 * ClassName：test_person
 *
 * @author: Devil
 * @Date: 2024/7/31
 * @Description:
 * @version: 1.0
 */
public class test_person {
    public static void main(String[] args) {
        //TODO 使用 new 关键字 创建对象
        person person = new  person();

        // TODO 对象赋值 对象名.属性名
        person.name="devil";
        person.age = 18;
        person.height = 180;
        person.weight =130;
        person.sex='男';

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.height);
        System.out.println(person.weight);
        System.out.println(person.sex);

        //TODO 调用方法 对象名.方法名
        person.eat();
        person.drink("哇哈哈");
    }
}
