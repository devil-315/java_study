package _07_线程通信;

/**
 * ClassName：Storage
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Storage {
    //容量
    private final int Max_size = 10;

    //产品个数
    private int product = 0;

    //生成
    public synchronized  void put() throws InterruptedException {
        if (product + 1 > Max_size){
            System.out.println("生产者：" + Thread.currentThread().getName() + "仓库满了");
            wait();
        }

        product++;
        System.out.println("生成者：" + Thread.currentThread().getName() + "生产了一个产品，现库存：" + product);
        notifyAll();
    }

    //消费
    public synchronized void pop(){
        if(product == 0){
            System.out.println("仓库没货了，消费者：" + Thread.currentThread().getName() + "消费了0个");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        product--;
        System.out.println("消费者："+Thread.currentThread().getName() +"消费了一个产品，先库存"+product);
        notifyAll();
    }
}
