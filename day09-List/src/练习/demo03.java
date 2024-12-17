package 练习;

import java.util.*;

/**
 * ClassName：demo03
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串单词，以空格分隔");
        String text = scanner.nextLine();

        String[] words =text.split(" ");

        HashMap<String , Integer> hashMap = new HashMap<>();
        for (String word:words) {
            word =  word.replace(" ","").toLowerCase();
            if( !word.isEmpty()){
                //获取指定key对应的value，如果没有这个key，即返回默认值，有就返回对应的value
                //getOrDefault(key,defaultValue);
                hashMap.put(word,hashMap.getOrDefault(word,0)+1);
            }
        }

        //次数
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "===>" + entry.getValue());
        }

        System.out.println("===============");

        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "===>" + entry.getValue());
        }
    }
}
