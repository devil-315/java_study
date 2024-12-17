package Test11;

import javax.management.remote.rmi.RMIServerImpl_Stub;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * ClassName：demo3
 *
 * @author: Devil
 * @Date: 2024/8/22
 * @Description:
 * @version: 1.0
 */
public class demo3 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student(1,"devil1"));
        hashSet.add(new Student(2,"devil2"));
        hashSet.add(new Student(3,"devil3"));
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的学号");
        id = scanner.nextInt();
        Student student = findById(id,hashSet);
        if (student != null) {
            System.out.println(student);
        }else {
            System.out.println("没有找到");
        }
    }
    public static Student findById (int id, HashSet<Student> hashSet){
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            if(id == next.getId()){
                return next;
            }
        }
        return null;
    }
}
