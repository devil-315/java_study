package _07_数组.数组排序;

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
        int[] arr = {1, 6, 2, 3, 8, 9, 5, 4, 7};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                min = arr[j] < arr[min] ? j : min;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
