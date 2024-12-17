package _03_局部变量和成员变量;

/**
 * ClassName：Person
 *
 * @author: Devil
 * @Date: 2024/7/31
 * @Description:
 * @version: 1.0
 */
public class Person {
    //TODO ===》成员变量
    String name;
    int age;
    double height;
    double weight;
    char sex;

    public void eat(){
        // TODO 局部变量
        int year = 10;
        //TODO 成员变量可以在任何位置使用
        age =20;

        System.out.println("民以食为天"
        );
    }

    public void drink(String drink){
        System.out.println("喝" + drink);
    }
}
