package Set.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * ClassName：LinkedHashSetTest
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("aaa");
        linkedHashSet.add("ccc");
        linkedHashSet.add("ddd");
        linkedHashSet.add("ggg");
        linkedHashSet.add("bbb");
        linkedHashSet.add("aaa");

        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
