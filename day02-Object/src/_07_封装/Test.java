package _07_封装;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/7/31
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        //设置值
        person.setName("devil");
        person.setAge(38);
        person.setHeight(180);
        person.setWeight(180);

        //获取
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getHeight());
        System.out.println(person.getWeight());

    }
}
