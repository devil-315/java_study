package _03_Lambada表达式.创建线程.匿名内部类;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 101; i++) {
                    System.out.println("====A====" + i);
                }
            }
        });

        thread.start();


        for (int i = 0 ;i < 101;i++){
            System.out.println("===B====" + i);
        }
    }
}
