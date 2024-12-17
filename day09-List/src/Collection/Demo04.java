package Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName：Demo04
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Demo04 {
    public static void main(String[] args) {
        Collection list = new ArrayList();

        list.add("devil");
        list.add("hello wolrd");

        list.add(new Person("devil",18));
        list.add(new String("Tom"));
        list.add(true);

        Collection list02 = new ArrayList();

        list02.add("devil");
        list02.add("hello");

        list.retainAll(list02);
        System.out.println(list);
        System.out.println(list02);
    }
}
