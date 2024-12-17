package _06_流程控制.while循环;

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
        int num = 1;
        int sum = 0;
        while(num <= 100){
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
