package Test14;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName：Cource
 *
 * @author: Devil
 * @Date: 2024/9/14
 * @Description:
 * @version: 1.0
 */
public class Course {
    private String course_name;
    private Integer course_id;
    private List<Student> Students = new ArrayList<>();

    public Course() {
    }

    public Course(String course_name, Integer course_id, List<Student> students) {
        this.course_name = course_name;
        this.course_id = course_id;
        Students = students;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(List<Student> students) {
        Students = students;
    }
}
