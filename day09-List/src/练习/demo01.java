package 练习;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * ClassName：demo01
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        ArrayList<Integer> list2 = removeDuplcatest(list);
        System.out.println(list2);
    }

    public static ArrayList<Integer> removeDuplcatest(ArrayList<Integer> list){
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>(list);
//        for (Integer num : list) {
//            hashSet.add(num);
//        }
        arrayList.addAll(hashSet);
        return arrayList;
    }
}
