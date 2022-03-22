package week11;

public class Square extends  Shape20{

    public Square(double width){
        super(width,width);
    }

    @Override
    public double getArea() {
       return width*width;
    }

    @Override
    public String toString() {
        return "area of square :"+getArea();
    }
}
