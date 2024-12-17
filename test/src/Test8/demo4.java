package Test8;

/**
 * ClassName：demo4
 *
 * @author: Devil
 * @Date: 2024/8/21
 * @Description:
 * @version: 1.0
 */
public class demo4 {
    public static void main(String[] args) {
        String str1 = "abcwerthello1yuiodefabcdef";
        String str2 = "cvhello1bnmabcdef";
        System.out.println(find(str1,str2));
    }
    public static String find(String str1,String str2){
        if(str1.length() == 0&&str2.length() == 0){
            return null;
        }
        String max = (str1.length() > str2.length())?str1:str2;
        String min = (str1.length() > str2.length())?str2:str1;
        int len = min.length();
        String result = "";
        for (int i = 0; i < len; i++) {
            for (int j = 0,k = len - i; k <= len ; j++,k++) {
                String substring = min.substring(j, k);
                if(max.contains(substring)){
                    result += substring+",";
                }
            }
            if(result.length() != 0){
                break;
            }
        }
        return result;
    }
}
