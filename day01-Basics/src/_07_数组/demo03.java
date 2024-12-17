package _07_数组;

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
        int scores[]={1,2,3,4,5};
        //数组越界
        scores[6] = 77;
        System.out.println(scores[6]);

    }
}
