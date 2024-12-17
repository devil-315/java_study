package _03_Lambada表达式.Demo01;

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
