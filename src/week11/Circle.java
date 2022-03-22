package week11;

public class Circle extends Shape20 {
    public Circle(double radious) {
        super(radious);

    }

    @Override
    public double getArea() {
        return pi * radious * radious;
    }

    @Override
    public String toString() {
        return "Area of circle:" + getArea();
    }
}
