package Test9;

/**
 * ClassName：boss
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class boss implements Runnable{
    private BanlAccount account;

    public boss(BanlAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (true){
            account.withdraw(100);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
