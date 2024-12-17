package _04_线程的状态及方法._06_线程中断;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("我要去找300块钱的爱情故事");
            try {
                Thread.sleep(1000);
                System.out.println("舒服");
            } catch (InterruptedException e) {
                System.out.println("谁坏我好事，原来是警察叔叔，你要相信我们是真爱，只是我们忘记了对方的名字");
            }
        });

        thread.start();

        Thread.sleep(1000);

        //如果线程没中断，手动中断
        if(!thread.isInterrupted()){
            System.out.println("查房");
            //中断线程
            thread.interrupt();
        }
    }
}
