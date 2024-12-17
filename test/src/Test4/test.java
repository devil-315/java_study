package Test4;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        Employee devil1 = new CommonEmployee("devil1", 18, 70000000);
        Manager devil2 = new Manager("devil2", 18, 900000000, 800000000);
        devil1.work();
        System.out.println("普通员工的薪水：" + devil1.getSalary());
        devil2.work();
        System.out.println("管理员的薪水和奖金：" + (devil2.getSalary() + devil2.getBonus()));
    }
}
