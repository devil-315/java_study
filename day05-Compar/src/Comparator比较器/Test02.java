package Comparator比较器;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("A",78),
                new Person("B",68),
                new Person("C",58),
                new Person("D",48)
        };

        //匿名内部类
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(Arrays.toString(people));
    }
}
