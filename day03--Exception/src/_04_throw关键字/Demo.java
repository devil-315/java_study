package _04_throw关键字;

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
        try{
            //手工抛出异常
            throw new Exception("我来玩一玩");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
