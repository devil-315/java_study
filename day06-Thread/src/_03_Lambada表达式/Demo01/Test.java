package _03_Lambada表达式.Demo01;

import _02_匿名内部类.UserService;

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
        UserService userService = () ->{
            System.out.println("查询成功");
        };

        userService.selectUser();
//        UserService.getInstance().selectUser();
    }
}
