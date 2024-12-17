package _15_接口.多实现;

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
        Channel channel =(Channel) iMessage;
        channel.connect();

        IMessagelmpl iMessage01 = new IMessagelmpl();
        iMessage01.connect();
    }
}
