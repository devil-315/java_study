package _06_流程控制.for循环;

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
        int n = 20;
        int m = 12;
        //取出较小值
//        int min = 0;
//        if(m < n){
//            min = m;
//        }else{
//            min = n;
//        }
        int min = m < n ? m : n;
        for(int i = min ;i>=1;i--){
            if ( m % i==0&&n%i==0){
                System.out.println("最大公约数："+i);
                break;
            }
        }
    }
}
