package Ishape;

public class Circle implements IShape {
    double radius;

    public Circle (double radius){
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
}
