
package rectangle;
import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;

    // khai báo biến
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Khai báo biến
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

//  Thiết lập chiều dài + rộng
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

// cong thuc tinh dien tich hinh chữ nhật
    public void calcArea() {
        area = length * width;
    }
//    Cong thuc tinh chu vi hinh chu nhat
    public void calcPerimeter() {
        perimeter = 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng từ người dùng
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();

        // Tạo đối tượng Rectangle
        Rectangle rectangle = new Rectangle(length, width);

        // Tính diện tích và chu vi
        rectangle.calcArea();
        rectangle.calcPerimeter();

        // Hiển thị diện tích và chu vi
        System.out.println("Diện tích của hình chữ nhật là: " + rectangle.getArea());
        System.out.println("Chu vi của hình chữ nhật là: " + rectangle.getPerimeter());

        // Thay đổi chiều dài và chiều rộng và tính lại diện tích và chu vi
        System.out.print("Nhập chiều dài mới của hình chữ nhật: ");
        double newLength = scanner.nextDouble();
        System.out.print("Nhập chiều rộng mới của hình chữ nhật: ");
        double newWidth = scanner.nextDouble();

        rectangle.setLength(newLength);
        rectangle.setWidth(newWidth);

        rectangle.calcArea();
        rectangle.calcPerimeter();

        // Hiển thị diện tích và chu vi sau khi thay đổi
        System.out.println("Diện tích sau khi thay đổi là: " + rectangle.getArea());
        System.out.println("Chu vi sau khi thay đổi là: " + rectangle.getPerimeter());

        scanner.close();
    }
}

