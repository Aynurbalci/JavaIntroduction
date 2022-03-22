package week11;

public abstract class Shape30 extends Shape20{
    protected double debth;
 public Shape30(double debth,double height,double width){
     super(height,width);
     this.debth=debth;
 }
 public Shape30(double height,double radius){
     super(height,0);
     this.radious=radius;
 }
 public abstract  double getVolume();

}
