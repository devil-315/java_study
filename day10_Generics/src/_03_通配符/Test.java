package _03_通配符;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        UserService<String> service = new UserService<>();
        service.setName("devil");
        change(service);

        UserService<Integer> service02 = new UserService<>();
        change(service02);
    }
    public static void change(UserService<? > service){
        System.out.println(service.getName());
    }
}
