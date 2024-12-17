package Test9;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        BanlAccount banlAccount = new BanlAccount();
        girl girl = new girl(banlAccount);
        boss boss = new boss(banlAccount);
        new Thread(girl).start();
        new Thread(boss).start();
    }
}
