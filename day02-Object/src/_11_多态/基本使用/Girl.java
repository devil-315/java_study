package _11_多态.基本使用;

/**
 * ClassName：Girl
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Girl extends Person{
    int weight;

    public Girl() {
    }

    public Girl(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void goShopping(){
        System.out.println("购物");
    }

    @Override
    public void eat() {
        System.out.println("仙女从不吃饭");
    }
}
