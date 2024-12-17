package _07_练习;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        BankAccout bankAccout = new BankAccout(1000);
        try {
            bankAccout.withdraw(1900);
        } catch (InsufficientBalanceException e) {
            throw new RuntimeException(e);
        }
        System.out.println("账户余额为："+bankAccout.getBalance());
    }
}
