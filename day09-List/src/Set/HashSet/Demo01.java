package Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * ClassName：Demo01
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(22);
        hashSet.add(32);
        hashSet.add(42);
        hashSet.add(52);
        hashSet.add(22);
        hashSet.add(12);

        //通过hashCode() 计算索引的位置
        System.out.println("aaa".hashCode() % 8);
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("===================");
        for (Object o: hashSet) {
            System.out.println(o);
        }
    }
}
