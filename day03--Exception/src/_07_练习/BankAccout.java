package _07_练习;

/**
 * ClassName：BankAccout
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class BankAccout {
    private double balance;

    public BankAccout(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public void withdraw(double amount)throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("超过余额，无法提取");
        }
        balance -= amount;
    }
}
