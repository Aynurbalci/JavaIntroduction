package School;

public class Week4Main {
    public static void main(String[] args) {
        Week4 week4=new Week4();
        week4.getName();
        try{
            int s= 40/0;
            System.out.println(s);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
