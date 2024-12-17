package _07_线程通信;

/**
 * ClassName：Comsumer
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Comsumer implements Runnable{
    private Storage storage;

    public Comsumer() {
    }

    public Comsumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                //消费
                storage.pop();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
