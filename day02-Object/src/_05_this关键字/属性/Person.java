package _05_this关键字.属性;

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
    //TODO 无参构造器
    //类中，默认存在这个方法
    public Person() {
        System.out.println("创建");
    }

    // TODO 有参构造器


    public Person(String Myname, int age, double height, double weight, char sex) {
//        System.out.println("诱人的");
        // TODO 当不重名的时候，可以省略this
        name=Myname;

        //TODO 当同名时不可以省略this 因为就近原则
        name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public void eat(){System.out.println("民以食为天");}

    public void drink(String drink){
        System.out.println("喝" + drink);
    }
}
