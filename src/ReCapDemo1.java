public class ReCapDemo1 {
    public static void main(String[] args) {
        int number1=20;
        int number2=25;
        int number3=30;
        int Bigger=number1;
        if(Bigger<number2){
            Bigger=number2;
        }
        if(Bigger<number3){
            Bigger=number3;
        }
        System.out.println("The bigger number is"+Bigger);
    }
}
