package test;

import java.util.Scanner;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //点餐
        Scanner scanner =new  Scanner(System.in);
        System.out.println("请选择想要制作的披萨：1.培根披萨 2.海鲜披萨");
        int num = scanner.nextInt();
        Pizza pizza = Factory.getPizza(num);

        pizza.show();
    }
}
