package Set.TreeSet.自然排序;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person("devil01",18));
        treeSet.add(new Person("devil02",28));
        treeSet.add(new Person("devil01",48));
        treeSet.add(new Person("devil03",38));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
