package school;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Course> courses;

    public Department(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

}
