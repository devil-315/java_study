package _15_接口.多实现;

/**
 * ClassName：IMessagelmpl
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */
public class IMessagelmpl implements IMessage, Channel{
    @Override
    public String getInfo() {
        return "后东西";
    }

    @Override
    public boolean connect() {
        System.out.println("连接");
        return true;
    }
}
