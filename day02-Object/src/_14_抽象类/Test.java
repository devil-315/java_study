package _14_抽象类;

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
        Message message = new Son();
        System.out.println(message.getConnect());
        message.getType();
        message.print();
        Message.show();
    }
}
