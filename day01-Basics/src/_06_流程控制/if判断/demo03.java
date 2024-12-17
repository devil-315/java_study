package _06_流程控制.if判断;

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
        int score = 67;
        if(score == 100){
            System.out.println("得到足浴奖励");
        }else if (score > 80 && score <= 90){
            System.out.println("大餐一顿");
        }else if(score >= 60 && score <= 80){
            System.out.println("恐龙园一日游");
        }else {
            System.out.println("藤条");
        }
    }
}
