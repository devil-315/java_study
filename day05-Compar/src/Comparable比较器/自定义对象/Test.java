package Comparable比较器.自定义对象;

import java.util.Arrays;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("A",78),
                new Person("B",68),
                new Person("C",58),
                new Person("D",48)
        };
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
