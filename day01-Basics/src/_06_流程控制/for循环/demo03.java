package _06_流程控制.for循环;

/**
 * ClassName：demo03
 *
 * @author: Devil
 * @Date: 2024/7/30
 * @Description:
 * @version: 1.0
 */
public class demo03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100;i < 1000;i++){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;

            if ((ge * ge * ge + shi * shi * shi +bai * bai * bai) == i){
                System.out.println("水仙花数："+i);
                count++;
            }
        }
        System.out.println("水仙花的个数："+count);
    }
}
