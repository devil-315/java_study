package 练习.第一题;

import java.util.Iterator;
import java.util.List;

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
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1",new User(1,18,"devil1"));
        userDAO.save("2",new User(2,18,"devil2"));
        userDAO.save("3",new User(3,18,"devil3"));
        userDAO.save("4",new User(4,18,"devil4"));

        List<User> list = userDAO.list();
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("========");
        userDAO.update("4",new User(6,19,"hhh"));
        User user = userDAO.get("4");
        System.out.println(user);

        System.out.println("==========");
        userDAO.delete("4");
        for (User user1 : userDAO.list()) {
            System.out.println(user1);
        }

    }
}
