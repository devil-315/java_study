package _09_内存分析.demo02;

/**
 * ClassName：Person
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Person {
    int id;
    int age;
    String name;

    public Person(int id,int age,String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person(1,18,"devil");
    }
}
