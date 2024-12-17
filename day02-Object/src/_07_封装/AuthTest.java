package _07_封装;

/**
 * ClassName：AuthTest
 *
 * @author: Devil
 * @Date: 2024/7/31
 * @Description:
 * @version: 1.0
 */
public class AuthTest {
    private int id;
    String name;
    protected double height;
    public double weight;
    //private 只能在同一个类中获取
    public void sun(){
        System.out.println(id);
    }
}
