package Map.HashMap;

import java.util.*;

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
        HashMap hashMap = new HashMap();
        hashMap.put("AA",123);
        hashMap.put("BB",123);
        hashMap.put(55,123);

        System.out.println(hashMap.containsKey("AA"));
        System.out.println(hashMap.containsValue(123));
        System.out.println(hashMap.get("BB"));

        System.out.println("===============");
        //TODO 遍历key
//        for (Object o : hashMap.keySet()) {
//            System.out.println(o);
//        }
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=============");
        //TODO 遍历value
        Collection values = hashMap.values();
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("===============");
        //TODO 遍历key-value
        //方式一
        Set keySet = hashMap.keySet();
        Iterator iterator2 = keySet.iterator();
        while (iterator2.hasNext()){
            System.out.println(hashMap.get(iterator2.next()));
        }
        System.out.println("=============");
        //方式二
        Set set1 = hashMap.entrySet();
        Iterator iterator3 = set1.iterator();
        while (iterator3.hasNext()){
//            System.out.println(iterator3.next());
            Map.Entry entry = (Map.Entry) iterator3.next();
            System.out.println(entry.getKey() + "===>" + entry.getValue());
        }
    }
}
