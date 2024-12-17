package _07_练习;

/**
 * ClassName：InsufficientBalanceException
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException() {
        System.out.println("账户余额不足");
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
