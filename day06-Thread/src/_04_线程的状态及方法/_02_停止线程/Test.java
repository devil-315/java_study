package _04_线程的状态及方法._02_停止线程;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test implements Runnable{
    //设置标志位
    private boolean flag = true;

    @Override
    public void run() {
        while (flag){
            System.out.println("《我的26岁女房客》");
        }
    }
    public void stop(){
        flag = false;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();

        for (int i = 0 ;i < 100;i++){
            System.out.println(i);
            if(i == 90){
                //调用方法，停止线程
                test.stop();

                System.out.println("线程停止了");
                break;
            }
        }
    }
}
