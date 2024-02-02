package qldh;

public class Teacher extends Person {
    // Additional attribute
    private int salary;

    // Constructor
    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    // Getter and setter methods for salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);

    }
}
