package Test12;

import java.util.Arrays;

/**
 * ClassName：Test5
 *
 * @author: Devil
 * @Date: 2024/8/23
 * @Description:
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        Integer[] arr = {2,7,1,5,6,9,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static <T extends Comparable<T>>void sort(T[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j].compareTo(arr[j + 1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
