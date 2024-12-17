package _05_线程并非问题._02_解决安全问题;

/**
 * ClassName：BuyTicket
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class BuyTicket_block implements  Runnable{
    private int ticket = 10;

    private boolean flag = true;
    @Override
    public void run() {
        while (flag){
            buy();
        }
    }

    private void buy() {
        synchronized (this) {
            if (this.ticket > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "买到了第" + ticket-- + "张票");
            } else {
                System.out.println("票卖完了");
                flag = false;
            }
        }
    }

    public static void main(String[] args) {
        BuyTicket_block buyTicket = new BuyTicket_block();
        new Thread(buyTicket,"苦逼的我").start();
        new Thread(buyTicket,"牛逼的美女").start();
        new Thread(buyTicket,"黄牛").start();
    }
}
