package TEST1;

/**
 * ClassName：demo01
 *
 * @author: Devil
 * @Date: 2024/8/17
 * @Description:
 * @version: 1.0
 */
public class demo01 {
    public static void main(String[] args) {
        int[] arr = {19,29,39,49,59};
        for (int num :
                add(arr, 2, 999)) {
            System.out.println(num);
        }
    }
    public static int[] add(int[] arr, int index, int num){
        int[] arrnew = new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            arrnew[i] = arr[i];
        }
        arrnew[index] = num;

        for (int i = index+1; i < arrnew.length; i++) {
            arrnew[i] = arr[i-1];
        }
        return arrnew;
    }
}
