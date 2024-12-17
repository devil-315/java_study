package _01_线程创建;

/**
 * ClassName：ThreadTest
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i = 0;i < 100; i++){
            System.out.println("========大嫂=========" + i);
        }
    }
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();

        //调用start方法，开启线程，调用run方法
        threadTest.start();

        for(int i = 0;i < 100; i++){
            System.out.println("========强哥=========" + i);
        }
    }
}
