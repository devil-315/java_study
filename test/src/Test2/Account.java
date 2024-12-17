package Test2;

/**
 * ClassName：Account
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getaMonthlyInterest(){
        return annualInterestRate / 12;
    }
    public void withdraw(double num){
        if(num > balance){
            System.out.println("余额不足");
        }else {
            balance -= num;
        }
    }
    public void deposit(double num){
        balance += num;
    }
}
