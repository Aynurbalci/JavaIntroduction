package week11;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10,20);
        Rectangle r2=new Rectangle(10,20);
        ComprentArea(r1,r2);
        Square s1=new Square(20);
        Square s2=new Square(30);
        ComprentArea(s1,s2);
        Circle c1=new Circle(12);
        Circle c2=new Circle(12);
        ComprentArea(c1,c2);
        CyLinder cy1=new CyLinder(10,5);
        Sphare sp1=new Sphare(1,4);
        CompareVolume(cy1,sp1);

    }
    public static void ComprentArea(Shape20 r1,Shape20 r2){
        if(r1.getArea()>r2.getArea()){
            System.out.println("birinci şekil alalnı"+r1.getArea()+"2 inci şekil alanı"+r2.getArea()+"dan büyüktür");
        }
        else if(r1.getArea()==r2.getArea()){
            System.out.println("her iki şeklinde alanı birbirine eşittir");
        }
        else{
            System.out.println("ikinci şeklin alanı"+r2.getArea()+"birin şeklin alanı"+r1.getArea()+" dan daha büyüktür");

        }
        System.out.println(r1.toString());
        System.out.println(r2.toString());

    }
    public static void CompareVolume(Shape30 r1,Shape30 r2){
        if(r1.getVolume()>r2.getVolume()){
            System.out.println("birinci şekil alalnı"+r1.getVolume()+"2 inci şekil alanı"+r2.getVolume()+"dan büyüktür");
        }
        else if(r1.getVolume()==r2.getVolume()){
            System.out.println("her iki şeklinde alanı birbirine eşittir");
        }
        else{
            System.out.println("ikinci şeklin alanı"+r2.getVolume()+"birin şeklin alanı"+r1.getVolume()+" dan daha büyüktür");

        }
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
    /*
    public static void ComprentArea2(Square r1,Square r2){
        if(r1.getArea()>r2.getArea()){
            System.out.println("birinci şekil alalnı"+r1.getArea()+"2 inci şekil alanı"+r2.getArea()+"dan büyüktür");
        }
        else if(r1.getArea()==r2.getArea()){
            System.out.println("her iki şeklinde alanı birbirine eşittir");
        }
        else{
            System.out.println("ikinci şeklin alanı"+r2.getArea()+"birin şeklin alanı"+r1.getArea()+" dan daha büyüktür");

        }
        System.out.println(r1.toString());
        System.out.println(r2.toString());


    }
    public static void ComprentArea3(Circle r1,Circle r2){
        if(r1.getArea()>r2.getArea()){
            System.out.println("birinci şekil alalnı"+r1.getArea()+"2 inci şekil alanı"+r2.getArea()+"dan büyüktür");
        }
        else if(r1.getArea()==r2.getArea()){
            System.out.println("her iki şeklinde alanı birbirine eşittir");
        }
        else{
            System.out.println("ikinci şeklin alanı"+r2.getArea()+"birin şeklin alanı"+r1.getArea()+" dan daha büyüktür");

        }
        System.out.println(r1.toString());
        System.out.println(r2.toString());


    }
    */


}
