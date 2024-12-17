package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName：Demo02
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        Collection list = new ArrayList();

        list.add("devil");
        list.add("hello wolrd");
        list.add(new Person("devil",18));
        list.add(new String("Tom"));
        list.add(true);

        boolean contains = list.contains("devil");
        System.out.println(contains);
        boolean contains2 = list.contains("Tom");
        System.out.println(contains2);
        boolean contains3 = list.contains(new Person("devil",18));
        //TODO 如果没有重写equals()方法，结果为false
        System.out.println(contains3);
    }
}
