package TEST1;

/**
 * ClassName：demo02
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
public class demo02 {
    public static void main(String[] args) {
        int[] arr = {18,28,38,48,58};
        for (int num :
                remove(arr,3)) {
            System.out.println(num);
        }
    }
    public static int[] remove(int[] arr, int index){
        int[] arrnew = new int[arr.length-1];
        for (int i = 0,j = 0; i < arr.length; i++) {
            if(i == index){
                continue;
            }
            arrnew[j++] = arr[i];
        }
        return arrnew;
    }
}
