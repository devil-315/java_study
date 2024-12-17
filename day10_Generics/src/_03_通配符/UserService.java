package _03_通配符;

/**
 * ClassName：UserService
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class UserService<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
