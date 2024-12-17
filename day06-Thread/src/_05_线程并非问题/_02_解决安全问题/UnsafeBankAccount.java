package _05_线程并非问题._02_解决安全问题;

/**
 * ClassName：UnsafeBankAccount
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class UnsafeBankAccount {
    private double Balance;

    public UnsafeBankAccount(double balance) {
        Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }

    //存钱
    public void  deposit(double accont){
        synchronized (this){
            this.Balance += accont;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //取钱
    public void  withDraw(double accont){
        synchronized (this){
            this.Balance -= accont;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
