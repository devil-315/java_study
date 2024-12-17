package Set.HashSet;


import java.util.HashSet;
import java.util.Iterator;

/**
 * ClassName：Demo03
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class Demo03 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person person1 = new Person("devil",18);
        Person person2 = new Person("devil",18);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        hashSet.add(person1);
        hashSet.add(new Person("devil3",28));
        hashSet.add(person2);
        hashSet.add(new Person("devil4",48));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=========");
        for (Object person :
                hashSet) {
            System.out.println(person);
        }

    }
}
