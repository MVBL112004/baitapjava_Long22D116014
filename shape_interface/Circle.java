package shape_interface;

public class Circle implements Shape {
    double circle;
    public Circle(double circle) {
        this.circle = circle;
    }
    @Override
    public double getArea() {
        return this.circle*this.circle*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.circle;
    }
}
