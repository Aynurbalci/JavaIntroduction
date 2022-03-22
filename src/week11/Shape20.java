package week11;

public abstract class Shape20 {

    final double pi=3.14;
    protected double height;
    protected double radious;
    protected   double width;
    public Shape20(double height,double width){
        this.height=height;
        this.width=width;


    }
    public Shape20(double radious){
        this.radious=radious;



    }
    public abstract double getArea();
    public abstract String toString();
    public void sayHI(){
        System.out.println("hi");
    }







}
