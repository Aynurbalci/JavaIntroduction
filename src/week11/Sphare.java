package week11;

public class Sphare extends Shape30{
    public Sphare(double debth,double radius){
        super(0,radius);
        this.debth=debth;
    }

    @Override
    public double getVolume() {
        return (4/3*pi*radious*radious*radious);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "volume of shaper"+getVolume();
    }
}
