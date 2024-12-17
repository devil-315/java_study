package _02_方法;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);

        System.out.println(Season.WINTER.getDesc());
        System.out.println(spring.getName());
        System.out.println(spring.getDesc());

        System.out.println("======================");
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }

        System.out.println("=======================");
        for (Thread.State value : Thread.State.values()) {
            System.out.println(value);
        }

        System.out.println("===========");
        Season winter = Season.valueOf("WINTER");
        System.out.println(winter.getDesc());
    }
}
