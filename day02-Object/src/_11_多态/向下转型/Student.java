package _11_多态.向下转型;

/**
 * ClassName：Student
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Student extends Person {
    double grade;

    public Student() {
    }

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void love(){
        System.out.println("谈恋爱");
    }

    @Override
    public void play() {
        System.out.println("元神");
    }

    @Override
    public void eat() {
        System.out.println("一万隆江猪脚饭，吃出男人的浪漫");
    }
}
