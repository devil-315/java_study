package Set.TreeSet;

import java.util.TreeSet;

/**
 * ClassName：Demo
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(7);
        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.lower(6));
        System.out.println(treeSet.lower(7));
        System.out.println(treeSet.ceiling(5));

        //TODo <5
        System.out.println(treeSet.headSet(5));

        //TODO <= 5
        System.out.println(treeSet.headSet(5,true));

        //TODO >= 5
        System.out.println(treeSet.tailSet(5));

        //TODO >5
        System.out.println(treeSet.tailSet(5,false));

        //TODO >=3 <9
        System.out.println(treeSet.subSet(3,9));

        //TODO >3  <=9
        System.out.println(treeSet.subSet(3,false,9,true));
    }
}
