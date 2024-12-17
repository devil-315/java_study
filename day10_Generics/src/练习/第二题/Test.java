package 练习.第二题;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName：Test
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("按照年龄和成绩排序");
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("liusan",20,90.0));
        students.add(new Student("lisi",22,90.0));
        students.add(new Student("wangwu",20,99.0));
        students.add(new Student("sunliu",22,100.0));
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("按照名字排序");
        TreeSet<Student> students1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        students1.addAll(students);
        for (Student student :
                students1) {
            System.out.println(student);
        }
    }
}
