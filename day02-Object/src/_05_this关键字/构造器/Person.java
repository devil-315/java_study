package _05_this关键字.构造器;

/**
 * ClassName：Person
 *
 * @author: Devil
 * @Date: 2024/7/31
 * @Description:
 * @version: 1.0
 */
public class Person {
    String name;
    int age;
    double height;
    double weight;

    //TODO 无参构造器
    public Person() {
        this("devil");
        System.out.println("无参");
    }

    //TODO 有参构造器
    public Person(String name, int age, double height, double weight) {

        //TODO 调用 无参构造器  只能写在第一行
        this();

        System.out.println("有参");
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name){

        System.out.println("有参，只有一个参数");
        this.name=name;
    }

    public  void  eat(){
        System.out.println("民以食为天");
    }

    public void play(String play){
        System.out.println("玩"+play);
    }
}
