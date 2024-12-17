package Test9;

/**
 * ClassName：demo
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class demo {
    private double balance;

    public demo() {
    }

    public demo(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double num) throws InterruptedException {
        this.balance += num;
        Thread.sleep(10);
    }

    public void withdraw(double num) throws InterruptedException {
        if(num <= this.balance){
            this.balance -= num;
            Thread.sleep(10);
        }else {
            System.out.println("余额不足");
        }
    }

    public static void main(String[] args) {
        demo demo = new demo(2000);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    demo.deposit(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    demo.withdraw(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("最后的余额：" + demo.getBalance());
    }
}
