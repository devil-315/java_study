package _07_数组.二维数组;

/**
 * ClassName：demo01
 *
 * @author: Devil
 * @Date: 2024/7/30
 * @Description:
 * @version: 1.0
 */
public class demo01 {
    public static void main(String[] args) {
        //TODO 方式一：
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //TODO 方式二：
        int[][] arr01 = new int[3][4];
        arr01[0][0]=1;
        arr01[0][1]=2;
        arr01[0][3]=3;
        arr01[1][0]=4;
        arr01[1][1]=5;
        arr01[1][2]=6;
        arr01[0][3]=7;
        arr01[2][0]=8;
        arr01[2][1]=9;
        arr01[2][2]=10;
        arr01[2][3]=11;

        //打印二维数组
        for(int i =0 ;i<arr.length;i++)
        {
            for(int j =0 ;j<arr[i].length;j++)
            {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        //

        System.out.println("=====for each===");
        for(int[] nums:arr){
            for(int num:nums)
            {
                System.out.println(num);
            }
        }
    }
}
