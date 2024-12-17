package _07_数组.常见算法;

/**
 * ClassName：SelectArr
 *
 * @author: Devil
 * @Date: 2024/7/30
 * @Description:
 * @version: 1.0
 */
public class SelectArr {

    public static void main(String[] args) {
        //TODO 查找 value 值第一次出现在数组中的下标
//        int[] arr = { 4 ,5 ,6 ,7, 1 ,9 ,10};
//        int value = 1;
//        for (int i =0 ;i<arr.length;i++)
//        {
//            if (arr[i]==value)
//            {
//                System.out.println(i);
//            }
//        }

        //TODO 二分查找
        int[] arr2 = {-99 , -54 , -2 ,0 ,2 ,33 ,46 ,253 ,888};
        int value2 = 33;
        int left = 0;
        int right = arr2.length-1;
        while(left <= right){
            int mid = (right+left)/2;
            if(arr2[mid] == value2)
            {
                System.out.println("索引为："+ mid);
                break;
            }else if(arr2[left]<value2)
            {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
    }
}
