package _15_接口.基本使用;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        IMessage iMessage = new IMessagelmpl();
        System.out.println(iMessage.getInfo());
        System.out.println(IMessage.NAME);
        IMessage.run();
    }
}
