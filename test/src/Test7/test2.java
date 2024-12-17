package Test7;

/**
 * ClassName：test2
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class test2 {
    public static void main(String[] args) {
        Bank bank = new Bank(1000);
        try {
            bank.withdraw(9000);
        } catch (InsufficientBalanceException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        System.out.println("余额为："+bank.getBalance());
    }
}
