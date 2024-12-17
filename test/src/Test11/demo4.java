package Test11;

import java.util.HashMap;
import java.util.Scanner;

/**
 * ClassName：demo4
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class demo4 {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("devil",90.0);
        hashMap.put("nana",100.0);
        hashMap.put("lili",95.0);
        hashMap.put("hehe",80.0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的姓名");
        String name = scanner.nextLine();
        if(hashMap.containsKey(name)){
            System.out.println(hashMap.get(name));
        }else {
            System.out.println("查不到");
        }

    }
}
