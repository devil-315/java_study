package _06_流程控制.break和continue;

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
        int sum = 0;
        for(int i = 1;i<=10;i++)
        {
            if ( i%2==0){
                System.out.println("这是偶数，跳过");
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
