package Test12;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName：Test6
 *
 * @author: Devil
 * @Date: 2024/8/23
 * @Description:
 * @version: 1.0
 */
public class Test6 {
    public static void main(String[] args) {
        Integer[] arr = {2,7,1,5,6,9,4};
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        sort(arr,comparator);
        System.out.println(Arrays.toString(arr));
    }
    public static <T>void sort(T[] arr, Comparator<? super T> c){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if(c.compare(arr[j],arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
