package person;

public class Student extends Person {
    // Additional attribute
    private double gpa;

    // Constructor
    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    // Getter and setter methods for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("GPA: " + gpa);
    }
}