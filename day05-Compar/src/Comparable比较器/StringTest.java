package Comparable比较器;

import java.util.Arrays;

/**
 * ClassName：StringTest
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String[] arr = new String[] {"ff","rr","bb","oo","aa"};
        Arrays.sort(arr);
        for(String items:arr){
            System.out.println(items);
        }

        System.out.println(Arrays.toString(arr));
    }
}
