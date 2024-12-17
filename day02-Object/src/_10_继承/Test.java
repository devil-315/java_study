package _10_继承;

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
        Student student = new Student();

        student.setName("devil");
        student.setAge(18);
        student.setGrade(100);
        System.out.println(student.getName());
        System.out.println(student.getGrade());
        System.out.println(student.getAge());

        student.eat();

        System.out.println("=======");

        Student student02 = new Student("haha",22,170);
        student02.study();
    }
}
