package week11;

public class Rectangle extends Shape20{
    public Rectangle(double width,double height){
        super(height,width);
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "area of this rectangle"+getArea();
    }
}
