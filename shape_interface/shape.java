package shape_interface;

import shape.k64.Circle;
import shape.k64.Rectangle;

import java.util.Scanner;

public interface shape {
    public abstract double getArea();
    public abstract double getPerimeter();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong hinh chu nhat : ");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu dai hinh chu nhat:");
        double length = scanner.nextDouble();
        // Goi bien rectangle1
        Rectangle rectangle1 = new Rectangle("hinh chu nhat", width, length);
        // Tinh dien tich hcn
        rectangle1.calculateArea();
        // In ra ket qua
        System.out.println("Dien tich hinh chu nhat la:" + rectangle1.calculateArea());
        // Nhap ban kinh
        System.out.print("Nhap ban kinh hinh tron:");
        double radius = scanner.nextDouble();
        // goi bien circle1
        Circle circle1 = new Circle("Hinh tron", radius);

        circle1.calculateArea();

        System.out.print("Dien tich hinh tron la:"+ circle1.calculateArea());

        scanner.close();
    }
}

