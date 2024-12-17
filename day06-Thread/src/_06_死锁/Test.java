package _06_死锁;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Test implements Runnable {
    private static Zhangsan zhangsan = new Zhangsan();
    private static Lisi lisi = new Lisi();

    public boolean flag = true;

    @Override
    public void run() {
        if (flag) {
            //张三
            synchronized (zhangsan) {
                zhangsan.say();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lisi){
                    zhangsan.get();
                }
            }
        }else {
            synchronized (lisi){
                lisi.say();
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                synchronized (zhangsan){
                    lisi.get();
                }
            }
        }
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.flag = true;
        Test test1 = new Test();
        test1.flag = false;
        Thread thread = new Thread(test, "张三");
        Thread thread1 = new Thread(test1, "李四");
        thread.start();
        thread1.start();
    }
}
