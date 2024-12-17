package _06_流程控制.for循环;

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
        //记录偶数的个数
        int count = 0;
        //计算和
        int sum = 0;

        for(int i = 1;i <= 100;i++){
            if(i%2 == 0){
                count++;
                sum += i;
            }
        }
        System.out.println("偶数的个数为：" + count);
        System.out.println("偶数的和：" + sum);
    }
}
