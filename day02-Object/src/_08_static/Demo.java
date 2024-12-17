package _08_static;

/**
 * ClassName：demo
 *
 * @author: Devil
 * @Date: 2024/7/31
 * @Description:
 * @version: 1.0
 */
public class Demo {
    //静态属性
    private  static int age;

    private double score;

    //静态方法
    public static void go(){
        System.out.println("走");
    }

    public void run(){
        System.out.println("跑");
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        //非静态变量
        System.out.println(demo.score);

        //静态变量
        System.out.println(Demo.age);

        //非静态方法
        demo.run();

        //静态方法
        Demo.go();
    }
}
