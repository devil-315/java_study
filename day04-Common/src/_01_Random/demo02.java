package _01_Random;

import java.util.Random;

/**
 * ClassName：demo02
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */

//生成没用0 且不重复的随机数
public class demo02 {
    public static void main(String[] args) {
        int[] data = new int[7];
        //下标
        int index = 0;
        Random random = new Random();
        //生成随机数 添加到数组
        while(index < 7){
            //生成随机数
            int num = random.nextInt(37);
            //判断这个随机数能不能用
            if(isUse(num,data)){
//                data[index] = num;
//                index++;
                data[index++] = num;
            }
        }

        for(int num:data){
            System.out.println(num);
        }
    }
    public static boolean isUse(int num,int temp[]){
        if(num == 0){
            return false;
        }
        for(int i = 0;i < temp.length;i++){
            if(num == temp[i]){
                return false;
            }
        }
        return true;
    }
}
