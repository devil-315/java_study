package _02_处理;

/**
 * ClassName：Demo
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("异常之前");
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("出现异常");
            e.printStackTrace();
        }finally {
            System.out.println("不管程序是否出现异常，都会执行");
        }

        System.out.println("异常之后");
    }
}
