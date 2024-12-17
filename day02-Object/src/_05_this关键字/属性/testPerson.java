package _05_this关键字.属性;

import _05_this关键字.属性.Person;

/**
 * ClassName：testPerson
 *
 * @author: Devil
 * @Date: 2024/7/31
 * @Description:
 * @version: 1.0
 */
public class testPerson {
    public static void main(String[] args) {
        Person person = new Person("devil", 12, 130, 150, '男');
        System.out.println(person.name);
        System.out.println(person.age);

    }
}
