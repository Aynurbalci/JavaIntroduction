package ExamExercises5;

public class CarMain {
    public static void main(String [] args){
        System.out.println(Car.counter);
        Car car1=new Car(2016,"Tofas");
        Car car2=new Car(1999,"skoda");
        System.out.println(Car.counter);
        Car car3=new Car(1990,"vosvos");
        Car car4=new Car(2003,"bmw");

        System.out.println(Car.counter);




    }
}
