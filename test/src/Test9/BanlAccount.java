package Test9;

/**
 * ClassName：BanlAccount
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class BanlAccount {
    private int balance;

    public BanlAccount() {
        this.balance = 0;
    }

    public synchronized int getBalance() {
        return balance;
    }
    public synchronized void deposit (int num){
        this.balance += num;
    }
    public synchronized void withdraw(int num){
        if(this.balance >= num){
            this.balance-=num;
            System.out.println("周老板取了：" + num +"元");
        }else {
            System.out.println("没钱让周老板取了");
        }
    }
}
