package _05_输入;

import java.util.Scanner;

/**
 * ClassName：demo01
 *
 * @author: Devil
 * @Date: 2024/7/30
 * @Description:
 * @version: 1.0
 */
public class demo01 {
    public static void main(String[] args) {
        //1.创建对象
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的名字：");
        String name = scanner.nextLine();

        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();

        System.out.println("名字："+name+"\n年龄："+age);
    }
}
