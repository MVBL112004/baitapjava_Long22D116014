package school;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private String courseID;
    private Instructor instructor;
    private List<Student> students;

    public Course(String name, String courseID) {
        this.name = name;
        this.courseID = courseID;
        students = new ArrayList<>();
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public String getName() {
        return name;
    }

    public String getCourseID() {
        return courseID;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Student> getRegisteredStudents() {
        return students;
    }

    public boolean isRegistered(Student student) {
        return students.contains(student);
    }

}
