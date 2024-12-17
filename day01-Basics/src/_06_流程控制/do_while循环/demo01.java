package _06_流程控制.do_while循环;

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
        //初始化部分
        int num = 1;

        //记录偶数和
        int sum = 0;
        //记录个数
        int count = 0;

        do{
            //循环体部分
            if(num % 2==0){
                sum += num;
                count++;
            }
            num++;
        }while (num <= 100);
        System.out.println(sum);
        System.out.println(count);
    }
}
