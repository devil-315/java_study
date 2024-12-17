package Set.TreeSet.定制排序;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

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
                return -Integer.compare(o1.getAge(),o2.getAge());
            }
            /*@Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User user1 = (User) o1;
                    User user2 = (User) o2;
                    return -Integer.compare(user1.getAge(),user2.getAge());
                }else {
                    throw new RuntimeException("类型不匹配");
                }
            }*/
        };
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.add(new User("devil01",18));
        treeSet.add(new User("devil02",28));
        treeSet.add(new User("devil03",38));
        treeSet.add(new User("devil04",48));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
