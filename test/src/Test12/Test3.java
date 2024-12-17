package Test12;

/**
 * ClassName：Test3
 *
 * @author: Devil
 * @Date: 2024/8/23
 * @Description:
 * @version: 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        method(arr,1,5);
        for (Integer num :
                arr) {
            System.out.println(num);
        }
    }
    public static <T>void method(T[] arr,int a,int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
