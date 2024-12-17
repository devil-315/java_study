package _06_自定义异常;

/**
 * ClassName：Food02
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class Food02 {
    public static void eat(int i) {
        if (i > 10) {
            System.out.println("吃太多了");
        }else{
            System.out.println("无所谓");
        }
    }
}

