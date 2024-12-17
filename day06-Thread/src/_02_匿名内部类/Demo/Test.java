package _02_匿名内部类.Demo;

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
        UserService userService = new UserService() {
            @Override
            public void selectUser() {
                System.out.println("你好");
            }
        };

        userService.selectUser();
        UserService.getInstance().selectUser();
    }
}
