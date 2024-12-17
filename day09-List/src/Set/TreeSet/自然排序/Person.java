package Set.TreeSet.自然排序;

import java.util.Objects;

/**
 * ClassName：Person
 *
 * @author: Devil
 * @Date: 2024/8/15
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        //按名字从大到小
        int compare = name.compareTo(o.name);
        if(compare != 0){
            return -compare;
        }else {
            //名字相同,按年龄升序
            return Integer.compare(this.age,o.age);
        }
    }
}
