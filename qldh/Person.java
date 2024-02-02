package qldh;

import shape.k64.Rectangle;

import java.util.Scanner;

// Person class
public class Person {
    // Attributes
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Display method
    public void display() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + address);
    }

    public static void main(String[] args) {
        // Test Person class
        Person person = new Person("Mai Vũ Bảo Long", 20, " Le Thuy");
        person.display();

        // Test Student class
        Student student = new Student("Nguyễn Hoàng Vũ", 20, "Le Thuy", 3.5);
        student.display();

        // Test Teacher class
        Teacher teacher = new Teacher("Nhã", 42, "QuangBinh University", 50000);
        teacher.display();

    }

}





