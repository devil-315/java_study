package Test2;

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
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
        checkAccount.withdraw(5000);
        System.out.println( "余额："+checkAccount.getBalance() + "可透支的额度：" + checkAccount.getOverdrafet());
        checkAccount.withdraw(18000);
        System.out.println( "余额："+checkAccount.getBalance() + "/n可透支的额度：" + checkAccount.getOverdrafet());
        checkAccount.withdraw(3000);
        System.out.println( "余额："+checkAccount.getBalance() + "/n可透支的额度：" + checkAccount.getOverdrafet());
    }
}
