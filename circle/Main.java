package circle;
import java.util.Scanner;

class Circle {
    private double length;
    private double area;
    private double perimeter;

    public Circle(double length) {
        this.length = length;
    }

    // Getter methods
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    // Setter method
    public void setLength(double length) {
        this.length = length;
    }

    // Calculate area and perimeter
    public void calcArea() {
        area = Math.PI * Math.pow(length, 2);
    }

    public void calcPerimeter() {
        perimeter = 2 * Math.PI * length;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài từ người dùng
        System.out.print("Nhap chieu dai cua hinh tron: ");
        double length = scanner.nextDouble();

        // Tạo đối tượng Circle
        Circle circle = new Circle(length);

        // Tính diện tích và chu vi
        circle.calcArea();
        circle.calcPerimeter();

        // Hiển thị diện tích và chu vi
        System.out.println("Dien tich cua hinh tron la: " + circle.getArea());
        System.out.println("Chu vi cua hinh tron la: " + circle.getPerimeter());

        // Thay đổi chiều dài và tính lại diện tích và chu vi
        System.out.print("Nhap chieu dai moi cua hinh tron: ");
        double newLength = scanner.nextDouble();
        circle.setLength(newLength);

        circle.calcArea();
        circle.calcPerimeter();

        // Hiển thị diện tích và chu vi sau khi thay đổi
        System.out.println("Dien tich sau khi thay đoi la: " + circle.getArea());
        System.out.println("Chu vi sau khi thay đoi la: " + circle.getPerimeter());

        scanner.close();
    }
}

