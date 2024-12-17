package _02_匿名内部类.传统模式;

import _02_匿名内部类.UserService;

/**
 * ClassName：UserServicelmp
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public class UserServicelmp implements UserService {
    @Override
    public void selectUser() {
        System.out.println("查询成功");
    }
}
