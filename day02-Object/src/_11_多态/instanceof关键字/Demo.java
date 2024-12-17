package _11_多态.instanceof关键字;

import _11_多态.基本使用.Person;
import _11_多态.基本使用.Student;

/**
 * ClassName：Demo
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Object object = new Student();
        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof String);
    }
}
