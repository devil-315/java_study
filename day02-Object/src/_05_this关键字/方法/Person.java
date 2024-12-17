package _05_this关键字.方法;

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
    }

    //TODO 有参构造器
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public  void  eat(){

        //TODO 在同一个类中，方法直接可以相互调用，this可以不写
        play("游戏");

        this.play("妹妹");

        System.out.println("民以食为天");
    }

    public void play(String play){
        System.out.println("玩"+play);
    }
}
