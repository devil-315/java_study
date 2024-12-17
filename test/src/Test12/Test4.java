package Test12;

/**
 * ClassName：Test4
 *
 * @author: Devil
 * @Date: 2024/8/23
 * @Description:
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        reverse(arr);
        for (Integer num :
                arr) {
            System.out.println(num);
        }
    }
    public static <T>void reverse(T[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            T temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
