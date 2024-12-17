package Test7;

/**
 * ClassName：Bank
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double num) throws InsufficientBalanceException {
            if(num > balance){
                throw new InsufficientBalanceException("余额不足，无法提取");
            }
            balance -= num;
    }
}
