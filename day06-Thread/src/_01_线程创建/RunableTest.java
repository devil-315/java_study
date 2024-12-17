package _01_线程创建;

/**
 * ClassName：RunableTest
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class RunableTest implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i < 100; i++){
            System.out.println("========大嫂=========" + i);
        }
    }

    public static void main(String[] args) {
        RunableTest runableTest = new RunableTest();

        Thread thread = new Thread(runableTest);

        thread.start();

        for(int i = 0;i < 100; i++){
            System.out.println("========强哥=========" + i);
        }
    }
}
