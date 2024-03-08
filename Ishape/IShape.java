package Ishape;

import Ishape.Circle;
import Ishape.Rectangle;

public interface IShape {
    public abstract double getArea();
    public abstract double getPerimeter();
    public static void main(String[] args) {
        IShape c1 = new Ishape.Circle(3.0);
        IShape c2 = new Circle(5.0);
        IShape n1 = new Ishape.Rectangle(2,3);
        IShape n2 = new Rectangle(3,5);
        IShape[] list = {c1,c2,n1,n2};
        for (IShape s:list) {
            System.out.println("Dien tich la:" + s.getArea());
            System.out.println("Chu vi la: " + s.getPerimeter());
        }
    }

}
