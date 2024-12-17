package _15_接口.多实现;

/**
 * ClassName：IMessage
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */
public interface IMessage {
    //全局常量
    public static final String NAME = "herb";

    //抽象方法
//    public static String getInfo();
    public String getInfo();
    //静态方法
    public static void run(){
        System.out.println("静态方法");
    }
}
