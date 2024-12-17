package _02_Math;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName：test
 *
 * @author: Devil
 * @Date: 2024/8/11
 * @Description:
 * @version: 1.0
 */
public class test {
    public static void main(String[] args) {
        //产生随机数1-6
        int a = (int) Math.random() * 6 + 1;
        int b = (int) Math.random() * 6 + 1;
        int c = (int) Math.random() * 6 + 1;

        //押宝
        Scanner scanner = new Scanner(System.in);
        System.out.println("请押宝（豹子 、 大 、 小）");
        String ya = scanner.nextLine();

        //判断结果
        boolean result = false;
        //switch支持string类型
        switch (ya){
            case "豹子" :
                if(a==b&&b==c){
                    result=true;
                }
                break;
            case "大":
                if(a+b+c > 9){
                    result = true;
                }
                break;
            case "小":
                result = a+b+c <= 9;
                break;
            default:
                System.out.println("输入有误");
        }
        System.out.println("a,b,c分别是："+a+","+b+","+c);
        System.out.println(result?"猜对了":"猜错了");
    }
}
