package _01_线程创建;

/**
 * ClassName：Hare
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class Hare implements Runnable{

    //胜利者
    private static String winner;
    @Override
    public void run() {
        for(int i = 1;i <= 100; i++) {
            //兔子
            if (Thread.currentThread().getName().equals("兔子") && i % 10 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            //判断比赛
            boolean gameOver = gameOver(i);
            if(gameOver){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "===>跑了" + i + "米");
        }
    }

    public boolean gameOver(int step){
        if(winner != null){
            return true;
        }else {
            if(step >= 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is "+ winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Hare hare = new Hare();
        Thread thread = new Thread(hare,"兔子");
        thread.start();
        new Thread(hare,"乌龟").start();

    }
}
