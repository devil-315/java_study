package _01_基本使用;

/**
 * ClassName：person
 *
 * @author: Devil
 * @Date: 2024/7/31
 * @Description:
 * @version: 1.0
 */
public class person {
    //TODO ===》成员变量
    String name;
    int age;
    double height;
    double weight;
    char sex;

    public void eat(){
        System.out.println("民以食为天");
    }

    public void drink(String drink){
        System.out.println("喝" + drink);
    }
}
