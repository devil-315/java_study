package Test8;

/**
 * ClassName：demo3
 *
 * @author: Devil
 * @Date: 2024/8/21
 * @Description:
 * @version: 1.0
 */
public class demo3 {
    public static void main(String[] args) {
        String str = "abcdef";
//        System.out.println(reverse(str,2,5));
        System.out.println(reverse2(str,2,5));
    }
    public static String reverse(String str,int a,int b){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str.substring(0,a));
        for (int i = b; i >= a ; i--) {
            stringBuffer.append(str.charAt(i));
        }
        stringBuffer.append(str.substring(b+1));
        return stringBuffer.toString();
    }
    public static String reverse2(String str,int a,int b){
        char[] chars = str.toCharArray();
        while (a<=b){
            char tem = chars[a];
            chars[a] = chars[b];
            chars[b] = tem;
            a++;
            b--;
        }
        return new String(chars);
    }
}
