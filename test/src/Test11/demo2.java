package Test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * ClassName：demo2
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        ArrayList<Integer> list1 = removeList(list);
        System.out.println(list1);
    }
    public static ArrayList<Integer> removeList(ArrayList list){
        HashSet<Integer> hashSet = new HashSet<Integer>(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(hashSet);
        return list1;
    }
}
