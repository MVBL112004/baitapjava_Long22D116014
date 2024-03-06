package shape_interface;

import shape_interface.Circle;
import shape_interface.Rectangle;

import java.util.Scanner;

public interface Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap chieu rong hinh chu nhat : ");
        // double width = scanner.nextDouble();
        // System.out.print("Nhap chieu dai hinh chu nhat:");
        // double length = scanner.nextDouble();
        // // Goi bien rectangle1
        // Rectangle rectangle1 = new Rectangle(width, length);
        // // Tinh dien tich hcn
        // rectangle1.getArea();
        // // In ra ket qua
        // System.out.println("Dien tich hinh chu nhat la:" + rectangle1.getArea());
        // // Nhap ban kinh
        // rectangle1.getPerimeter();
        // System.out.println("Chu vi hinh chu nhat la: " + rectangle1.getPerimeter());
        // System.out.print("Nhap ban kinh hinh tron:");
        // double circle = scanner.nextDouble();
        // // goi bien circle1
        // Circle circle1 = new Circle(circle);
        // circle1.getArea();
        // System.out.println("Dien tich hinh tron la:"+ circle1.getArea());
        // circle1.getPerimeter();
        // System.out.print("Chu vi hinh tron la:"+ circle1.getPerimeter());
        // scanner.close();
        Shape c1 = new Circle(3.0);
        Shape c2 = new Circle(5.0);
        Shape n1 = new Rectangle(2,3);
        Shape n2 = new Rectangle(3,5);
        Shape[] list = {c1,c2,n1,n2};
        for (Shape s:list){
            System.out.println("Dien tich la:" + s.getArea());
        }
        for (Shape c:list){
            System.out.println("Chu vi la: " + c.getPerimeter());
        }
    }
}

