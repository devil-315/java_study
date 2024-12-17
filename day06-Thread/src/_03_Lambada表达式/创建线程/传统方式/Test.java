package _03_Lambada表达式.创建线程.传统方式;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 101; i++){
            System.out.println("====线程A====" + i);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();

        for (int i = 0; i < 101;i++){
            System.out.println("===线程B====" + i);
        }
    }
}
