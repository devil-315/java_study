package _06_流程控制.if判断;

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
        String str1 = "devil";
        // toLowerCase()
        String str2 = "DEVIL".toLowerCase();

        //todo 比较的是地址
        if (str1 == str2){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }

        //todo equals()比较的是内容
        if (str1.equals(str2)){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }
}
