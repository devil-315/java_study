package _04_String;

/**
 * ClassName：test02
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class test02 {
    public static void main(String[] args) {
        String str1 = "   qwe  qwert   ";
        String trim = Trim(str1);
        System.out.println(trim);
    }
    public static String Trim(String str){
        String str2 = "";
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }
            str2 += str.charAt(i);
        }
        return str2;
    }
}
