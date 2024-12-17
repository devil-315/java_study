package _04_extends;

/**
 * ClassName：BB
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class BB extends AA{
    int age;

    public BB() {
    }

    public BB(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "BB{" +
                "age=" + age +
                '}';
    }
}
