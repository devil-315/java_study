package _07_数组;

import org.w3c.dom.ls.LSOutput;

/**
 * ClassName：demo04
 *
 * @author: Devil
 * @Date: 2024/7/30
 * @Description:
 * @version: 1.0
 */
public class demo04 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("数组的长度："+arr.length);

        //通过下标取值
        System.out.println("========for循环======");
        for (int i =0 ;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("=====for each循环====");
        for(int num:arr){
            System.out.println(num);
        }
    }
}
