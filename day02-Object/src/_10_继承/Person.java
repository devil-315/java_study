package _10_继承;

/**
 * ClassName：Person
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Person {
    private  String name;
    private int age;

    public Person() {
        System.out.println("父类的无参");
    }

    public Person(String name, int age) {
        System.out.println("父类的有参");
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("民以食为天");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
