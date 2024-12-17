package 练习;

import java.util.*;

/**
 * ClassName：demo02
 *
 * @author: Devil
 * @Date: 2024/8/15
 * @Description:
 * @version: 1.0
 */
public class demo02 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student(1,"devil1"));
        hashSet.add(new Student(2,"devil2"));
        hashSet.add(new Student(3,"devil3"));
        hashSet.add(new Student(4,"devil4"));
        hashSet.add(new Student(5,"devil5"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号");
        int i = scanner.nextInt();
        Student student = findStudentById(hashSet,i);
//        System.out.println(findStudentById(hashSet,i));

        if(student != null){
            System.out.println(student);
        }else {
            throw new RuntimeException("没找到");
        }
    }
    public  static Student findStudentById(HashSet hashSet, int id){
        Student student = null;
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            student = (Student) iterator.next();
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }
}
