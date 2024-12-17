package _06_集合中使用泛型;

import java.util.*;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        list.add("234");
        for (Integer num :
                list) {
            System.out.println(num);
        }
        System.out.println("=================");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=================");

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("devil",18);
        hashMap.put("lili",18);
        hashMap.put("wuwu",18);
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
            Map.Entry<String, Integer>entry = iterator1.next();
            System.out.println(entry.getKey() + "===>" + entry.getValue());
        }
    }
}
