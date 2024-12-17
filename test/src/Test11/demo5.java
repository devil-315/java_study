package Test11;

import java.util.*;

/**
 * ClassName：demo5
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入文本");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words));
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word:
             words) {
            word = word.toLowerCase();
            hashMap.put(word,hashMap.getOrDefault(word,0) + 1);
        }
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
