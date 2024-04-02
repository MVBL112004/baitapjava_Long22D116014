package school;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private List<Department> departments;

    public School(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

}
