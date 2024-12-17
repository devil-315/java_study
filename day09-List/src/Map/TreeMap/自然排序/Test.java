package Map.TreeMap.自然排序;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(new Person("devil1",18),18);
        treeMap.put(new Person("devil2",28),28);
        treeMap.put(new Person("devil1",38),38);
        treeMap.put(new Person("devil4",48),48);

        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
