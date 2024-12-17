package IO.序列化;

import java.io.Serial;
import java.io.Serializable;

/**
 * ClassName：Person
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 6344451038562617821L;

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
