package _13_object类;


/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
//        int a = 20;
//        int b = 20;
//        //
//        System.out.println(a == b);
//
//        Person person = new Person();
//        Person person01 = new Person();
//        System.out.println(person01 == person);
//
//        Person person3 = person01;
//        System.out.println(person01 == person3);

        //TODO ==在基本数据类型中，比较的是字面量
        int a = 100;
        int b = 100;
        double c =100.0;

        System.out.println( a == b);
        System.out.println(a == c);

        //TODO ==在引用数据类型中，比较的是地址

        String str1 = new String("bat");
        String str2 = new String("bat");
        System.out.println(str1 == str2);


        //TODO equals 只能用在引用数据类型中

        //TODO 如果没用重写equals方法，走的是Object类的equals方法名比较的还是地址。
        // 如果重写equals方法，走的重写后的方法，比较的是值
        System.out.println(str1.equals(str2));

        Person person1 = new Person("devil",18);
        Person person2 = new Person("devil",18);
        System.out.println(person2.equals(person1));

        System.out.println(person1);
        System.out.println(person1.toString());

        System.out.println(str1);
        System.out.println(str1.toString());

    }
}
