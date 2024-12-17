package Comparable比较器.自定义对象;

/**
 * ClassName：Person
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
//        if(this.age>o.age){
//            return -1;
//        } else if (this.age<o.age) {
//            return 1;
//        }else {
//            return 0;
//        }
        return this.age-o.age;
    }
}
