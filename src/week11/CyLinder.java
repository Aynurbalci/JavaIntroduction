package week11;

public class CyLinder extends Shape30{
    public  CyLinder(double height,double radious){
        super(height,radious);

    }

    @Override
    public double getVolume() {
        return pi*radious*radious*height;
    }

    @Override
    public double getArea() {
        return (2*pi*radious*radious)+(2*pi*radious*height);
    }

    @Override
    public String toString() {
        return "volume of cylinder"+getVolume()+"area cylinder"+getArea();
    }

}
