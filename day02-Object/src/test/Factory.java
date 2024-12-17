package test;

import java.util.Scanner;

/**
 * ClassName：Factory
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Factory extends Pizza{
    public static Pizza getPizza(int num){
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = null;
        if(num == 1){
            System.out.println("请输入培根的克数：");
            int gram = scanner.nextInt();
            System.out.println("请输入披萨的大小：");
            double size = scanner.nextDouble();
            System.out.println("请输入披萨的价格");
            double prize = scanner.nextDouble();

            pizza = new Peigen("培根披萨",prize,size,gram);
        }
        if(num == 2){
            System.out.println("请输入配料：");
           String  peiliao = scanner.next();
            System.out.println("请输入披萨的大小：");
            double size = scanner.nextDouble();
            System.out.println("请输入披萨的价格");
            double prize = scanner.nextDouble();
            pizza = new Haixian("海鲜披萨",prize,size,peiliao);
        }
        return pizza;
    }
}
