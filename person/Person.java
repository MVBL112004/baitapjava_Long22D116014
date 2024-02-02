package person;

import shape.k64.Rectangle;

import java.util.Scanner;

// Person class
public class Person {
    private String name;
    private int age;
    private String address;

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


    public void setName(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println(this);
        //        System.out.println("Ten: " + name);
//        System.out.println("Tuoi: " + age);
//        System.out.println("Dia chi: " + address);
    }

    @Override
    public String toString(){
        return "Person{" +
                "Ten='" + name + '\'' +
                ", Age=" + age +
                ", Dia chi='" + address + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Person p1 = new Person("Dung",20,"Dong hoi" );
        p1.display();

        // Test Student class
        Student hs = new Student("Nguyễn Hoàng Vũ", 20, "Le Thuy", 3.5);
        hs.display();

        // Test Teacher class
        Teacher gv = new Teacher("Nhã", 42, "QuangBinh University", 50000);
        gv.display();

    }

}





