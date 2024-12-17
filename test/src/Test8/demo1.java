package Test8;

/**
 * ClassName：demo1
 *
 * @author: Devil
 * @Date: 2024/8/21
 * @Description:
 * @version: 1.0
 */
public class demo1 {
    public static void main(String[] args) {
        String str = "            abc        def       ";
        System.out.println(myTrim(str));
    }

    public static String myTrim(String str) {
        if (str.length() == 0) {
            return null;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right && str.charAt(left) == ' ') {
            left++;
        }
        while (left < right && str.charAt(right) == ' ') {
            right--;
        }
        return str.substring(left, right + 1);
    }
}
