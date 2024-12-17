package _10_继承;

/**
 * ClassName：Student
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */

//Student 是一个子类
public class Student extends Person {
    private int grade;

    public Student() {
        super();
        System.out.println("子类的无参");
    }

    public Student(String name, int age, int grade) {
        super(name, age);
        System.out.println("子类的有参");
        this.grade = grade;
    }

    public void eat(){
        System.out.println("学生吃饭");
    }

    public void study(){
        System.out.println("学习");

        //调用当前类的eat方法
        this.eat();

        //调用父类的eat方法
        super.eat();
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
