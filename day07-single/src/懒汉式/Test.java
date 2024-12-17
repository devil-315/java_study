package 懒汉式;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getINSTANCE();
//        System.out.println(singleton);
//
//        Singleton singleton1 = Singleton.getINSTANCE();
//        System.out.println(singleton1);
//        System.out.println(singleton == singleton1);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton.getINSTANCE();
            }).start();
        }
    }
}
