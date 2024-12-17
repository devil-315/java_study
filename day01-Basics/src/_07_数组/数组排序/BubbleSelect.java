package _07_数组.数组排序;

/**
 * ClassName：BubbleSelect
 *
 * @author: Devil
 * @Date: 2024/7/30
 * @Description:
 * @version: 1.0
 */
public class BubbleSelect {
    public static void main(String[] args) {
        int[] arr ={10,9,8,7,6,5,4,3,2,1};
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j =0;j<arr.length-1-i;j++)
            {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for( int num:arr)
        {
            System.out.println(num);
        }
    }
}
