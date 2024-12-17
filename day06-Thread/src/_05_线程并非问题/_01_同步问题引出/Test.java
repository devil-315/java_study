package _05_线程并非问题._01_同步问题引出;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        UnsafeBankAccount unsafeBankAccount = new UnsafeBankAccount(1000);

        //存钱线程
        Thread depositthread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                unsafeBankAccount.deposit(10);
            }
        });

        //取钱线程
        Thread withDrawthread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                unsafeBankAccount.withDraw(10);
            }
        });

        depositthread.start();
        withDrawthread.start();

        try {
            depositthread.join();
            withDrawthread.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("最终剩余多少钱： "+ unsafeBankAccount.getBalance());
    }
}
