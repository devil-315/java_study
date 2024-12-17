package ArrayListTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("devil");
        arrayList.add("hello");
        arrayList.add(new Person("devil01",12));
        arrayList.add(new Person("devil02",18));
        arrayList.add(new Person("devil03",22));
        arrayList.add("123");
        arrayList.add("hello");
        System.out.println(arrayList);

        //在指定位置添加元素
        arrayList.add(2,"哈哈哈哈哈哈哈哈哈哈哈");
        System.out.println(arrayList);

        //删除指定元素 , 第一次出现的
        arrayList.remove("hello");
        System.out.println(arrayList);

        //删除指定位置的元素
        arrayList.remove(2);
        System.out.println(arrayList);

        System.out.println("====fori 循环======");
        for (int i = 0; i < arrayList.size(); i++) {
            Object o = arrayList.get(i);
            System.out.println(o);
        }

        System.out.println("====for each 循环======");
        for (Object o:arrayList) {
            System.out.println(o);
        }

        System.out.println("====iterator 循环======");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
