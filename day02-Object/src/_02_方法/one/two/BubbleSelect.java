package _02_方法.one.two;

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
        BubbleSelect bubbleSelect = new BubbleSelect();

        bubbleSelect.BubbleSelect(arr);
        for( int num:arr)
        {
            System.out.println(num);
        }
    }
    public void  BubbleSelect(int[] arr){
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j =0;j<arr.length-1-i;j++)
            {
                if(arr[j] > arr[j+1]) {
                    swap(arr,i,j);
                }
            }
        }
    }


    public void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
