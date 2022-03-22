package week11;

public class Cone extends  Shape30{
    public  Cone(double height,double radius){
        super(height, radius);
    }

    @Override
    public double getVolume() {
        return (pi*radious*radious);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "volume of coni"+getVolume();
    }
}
