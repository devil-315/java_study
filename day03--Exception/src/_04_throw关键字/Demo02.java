package _04_throw关键字;

/**
 * ClassName：Demo02
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class Demo02 {
    public static int div(int x, int y)throws Exception{
        int temp=0;
        try {
            temp = x/y;
        }catch (Exception e){
            throw e;
        }finally {
            System.out.println("不管是否报错，我都执行");
        }
        return temp;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(div(8,0));
    }
}
