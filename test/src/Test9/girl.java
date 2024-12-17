package Test9;

/**
 * ClassName：girl
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class girl implements Runnable{
    private BanlAccount account;

    public girl(BanlAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (true){
            int balance = account.getBalance();
            if(balance < 100){
                account.deposit(2000);
                System.out.println("死鬼节约点用，存了2000元");
                synchronized (account){
                    account.notify();
                }
            }
        }
    }
}
