package Map.TreeMap.定制排序;

import java.util.*;

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
        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        };
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.put(new User("devil01",18),18);
        treeMap.put(new User("devil02",28),28);
        treeMap.put(new User("devil01",38),38);
        treeMap.put(new User("devil03",48),48);

        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
        }

    }
}
