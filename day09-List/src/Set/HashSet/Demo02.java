package Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * ClassName：Demo02
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("aaa");
        hashSet.add("ddd");
        hashSet.add("ccc");
        hashSet.add("uuu");
        hashSet.add("bbb");
        hashSet.add("ddd");

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===========");
        for (Object o :
                hashSet) {
            System.out.println(o);
        }
    }
}
