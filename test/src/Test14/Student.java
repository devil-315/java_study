package Test14;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName：Student
 *
 * @author: Devil
 * @Date: 2024/9/14
 * @Description:
 * @version: 1.0
 */
public class Student {
    private Integer student_id;
    private String student_name;
    private List<Course> courses = new ArrayList<>();

    public Student() {
    }

    public Student(Integer student_id, String student_name, List<Course> courses) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.courses = courses;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
