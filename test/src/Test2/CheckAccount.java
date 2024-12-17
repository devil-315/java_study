package Test2;

/**
 * ClassName：CheckAccount
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class CheckAccount extends Account{
    private double overdrafet;

    public CheckAccount() {
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdrafet) {
        super(id, balance, annualInterestRate);
        this.overdrafet = overdrafet;
    }

    public double getOverdrafet() {
        return overdrafet;
    }

    public void setOverdrafet(double overdrafet) {
        this.overdrafet = overdrafet;
    }

    @Override
    public void withdraw(double num) {
        if(num <= getBalance()){
            super.withdraw(num);
        }else {
            if((getBalance() + overdrafet) >= num){
                overdrafet -= (num - getBalance());
                //余额归0
                super.withdraw(getBalance());
            }else {
                System.out.println("超过可透支余额");
            }
        }
    }
}
