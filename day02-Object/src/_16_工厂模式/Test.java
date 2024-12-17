package _16_工厂模式;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/2
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
//        Bread bread = new Bread();
//        bread.eat();
//
//        Milk milk = new Milk();
//        milk.eat();
        Food food = Factory.getInstance("面包");
        food.eat();
    }
}
