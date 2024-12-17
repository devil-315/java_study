package _02_匿名内部类;

/**
 * ClassName：UserService
 *
 * @author: Devil
 * @Date: 2024/8/13
 * @Description:
 * @version: 1.0
 */
public interface UserService {
    public void selectUser();

    public static UserService getInstance(){
        return new UserService() {
            @Override
            public void selectUser() {
                System.out.println("哈哈哈哈");
            }
        };
    }
}
