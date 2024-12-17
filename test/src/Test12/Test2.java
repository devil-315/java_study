package Test12;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName：Test2
 *
 * @author: Devil
 * @Date: 2024/8/23
 * @Description:
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("按照成绩和年龄排序");
        TreeSet<Student> students = new TreeSet<>();
        Student liusan = new Student("liusan", 20, 90.0);
        Student lisi = new Student("lisi", 22, 90.0);
        Student wangwu = new Student("wangwu", 20, 99.0);
        Student sunliu = new Student("sunliu", 22, 100.0);
        students.add(liusan);
        students.add(lisi);
        students.add(wangwu);
        students.add(sunliu);
        for (Student student:
             students) {
            System.out.println(student);
        }
        System.out.println("按照名字排序");
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        TreeSet<Student> students1 = new TreeSet<>(comparator);
        students1.addAll(students);
        Iterator<Student> iterator = students1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
