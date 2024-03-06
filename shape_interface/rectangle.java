package shape_interface;

public class rectangle implements shape {
    double width;
    double length;

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() {
        return this.length+this.width;
    }
}
