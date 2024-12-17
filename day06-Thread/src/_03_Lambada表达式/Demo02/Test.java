package _03_Lambada表达式.Demo02;


/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        UserService userService = (a,b) ->{
            System.out.println("查询成功");
            return a+b;
        };

        UserService userService1 = (a,b) -> a+b;
        System.out.println(userService.add(1,2));;

        System.out.println(userService1.add(6,6));
    }
}
