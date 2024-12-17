package Test8;

/**
 * ClassName：demo2
 *
 * @author: Devil
 * @Date: 2024/8/21
 * @Description:
 * @version: 1.0
 */
public class demo2 {
    public static void main(String[] args) {
        String str = "       abc        def     ";
        System.out.println(myTrim2(str));
    }
    public static String myTrim2(String str){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
