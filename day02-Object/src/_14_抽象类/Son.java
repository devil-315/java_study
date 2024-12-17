package _14_抽象类;

/**
 * ClassName：Son
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */
public class Son extends Message{
    @Override
    public String getConnect() {
        return "200负载";
    }
}
