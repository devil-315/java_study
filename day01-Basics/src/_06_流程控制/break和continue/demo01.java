package _06_流程控制.break和continue;

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
        int sum = 0;
        for (int i=1;;i++)
        {
            sum += i;
            if(i==100){
                break;
            }
        }
        System.out.println(sum);
    }
}
