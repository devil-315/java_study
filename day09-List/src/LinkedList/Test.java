package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

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
        LinkedList linkedList = new LinkedList();
        linkedList.add("aaa");
        linkedList.add("bbb");
        linkedList.add("ccc");
        linkedList.add("ddd");
        System.out.println(linkedList);
        //获取
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());

        //添加
        linkedList.addFirst("eee");
        linkedList.offerFirst("ggg");
        linkedList.addLast("uuu");
        System.out.println(linkedList);

        //删除第一次出现的指定元素
        linkedList.remove("ddd");
        System.out.println(linkedList);
        //删除第一个元素
        linkedList.remove();
        linkedList.removeFirst();
        System.out.println(linkedList);
        //删除最后一个元素
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.pollLast();
        System.out.println(linkedList);

//        linkedList.clear();
//        System.out.println(linkedList.size());

        //迭代器
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
