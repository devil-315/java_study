package Test7;

/**
 * ClassName：InsufficientBalanceException
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("余额不足");
    }
    public InsufficientBalanceException(String message){
        super(message);
    }
}
