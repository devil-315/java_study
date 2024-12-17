package _04_String;

/**
 * ClassName：test1
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class test1 {
    public static void main(String[] args) {
        String str1 = "          qwe   qwert     ";
        String str2 = myTrim(str1);
        System.out.println(str2);
    }
    public static String myTrim(String str){
        int left = 0;
        int right = str.length()-1;

        while (left < right && str.charAt(left) == ' '){
            left++;
        }

        while (left < right && str.charAt(right) == ' '){
            right--;
        }
        return  str.substring(left,right+1);
    }
}
