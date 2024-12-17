package _07_线程通信;

/**
 * ClassName：Prodeucer
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Prodeucer implements Runnable{
    private Storage storage;

    public Prodeucer() {
    }

    public Prodeucer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                //生产
                storage.put();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
