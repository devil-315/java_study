package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * ClassName：Demo03
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Demo03 {
    public static void main(String[] args) {
        Collection list = new ArrayList();

        list.add("devil");
        list.add("hello wolrd");

        list.add(new Person("devil",18));
        list.add(new String("Tom"));
        list.add(true);

        //删除
        list.remove("devil");

        //TODO 集合 ==》数组
        Object[] objects = list.toArray();
        for (Object o : objects) {
            System.out.println(o);
        }

        //TODO 数组 ==》 集合 asList
        Collection strings = Arrays.asList(new String[]{"devil", "hello", "world"});
        System.out.println(strings);

        list.removeAll(strings);
        System.out.println(list);
    }
}
