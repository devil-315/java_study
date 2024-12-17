package 懒汉式;


/**
 * ClassName：Singleton
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getINSTANCE() {
        //双重检测
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    System.out.println("进来了");
                    //实例化
                    instance = new Singleton();
                }
                System.out.println(instance);
            }
        }
        return instance;
    }
}

