package shape_interface;

public class circle implements shape {
    double circle;

    @Override
    public double getArea() {
        return this.circle*this.circle*3.14;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*this.circle;
    }
}
