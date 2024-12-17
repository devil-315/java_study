package Test2;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045 );
        account.withdraw(30000);
        System.out.println(account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.getBalance());
        System.out.println(account.getaMonthlyInterest());
    }
}
