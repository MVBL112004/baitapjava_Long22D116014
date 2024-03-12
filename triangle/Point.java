package triangle;
import java.util.Scanner;
public class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Hay nhap toa do canh a!");
        System.out.print("Nhap toa do cua x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Nhap toa do cua y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Hay nhap toa do canh b!");
        System.out.print("Nhap toa do cua x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Nhap toa do cua y2: ");
        int y2 = scanner.nextInt();
        System.out.println("Hay nhap toa do canh c!");
        System.out.print("Nhap toa do cua x3: ");
        int x3 = scanner.nextInt();
        System.out.print("Nhap toa do cua y3: ");
        int y3 = scanner.nextInt();
        Triangle t = new Triangle(x1,y1,x2,y2,x3,y3);
        System.out.print("Chu vi cua Hinh tam giac la: " + t.getPerimeter());
    }
}