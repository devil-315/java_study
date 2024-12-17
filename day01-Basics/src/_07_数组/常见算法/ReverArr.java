package _07_数组.常见算法;

/**
 * ClassName：ReverArr
 *
 * @author: Devil
 * @Date: 2024/7/30
 * @Description:
 * @version: 1.0
 */
public class ReverArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i =0;i<arr.length/2;i++)
        {
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-i-1]=temp;
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}
