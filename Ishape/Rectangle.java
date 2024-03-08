package Ishape;

public class Rectangle implements IShape{
    double length;
    double width;
    public Rectangle(double width, double length) {
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
