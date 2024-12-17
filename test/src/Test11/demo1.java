package Test11;

import java.util.LinkedList;

/**
 * ClassName：demo1
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class demo1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.println( list.get(i));
        }
    }
}
