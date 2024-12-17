package iterator迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("devil");
        list.add("hello");
        list.add(new String("Tom"));
        list.add(true);

        //方式一：
        for (Object o: list) {
            System.out.println(o);
        }

        //方式二：
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
