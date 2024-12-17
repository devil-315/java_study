package _06_流程控制.while循环;

/**
 * ClassName：demo02
 *
 * @author: Devil
 * @Date: 2024/7/30
 * @Description:
 * @version: 1.0
 */
public class demo02 {
    public static void main(String[] args) {
        int num = 1;

        //偶数和
        int sum = 0;
        //偶数个数
        int count = 0;
        while (num <= 100){
            if(num % 2==0){
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("偶数个数："+count +"偶数和"+sum);
    }
}
