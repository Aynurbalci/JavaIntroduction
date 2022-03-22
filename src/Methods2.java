public class Methods2 {
    public static void main(String[] args) {
 String message="The weather is so good,today.";
 //String newMessage=message.substring(2,8);
        String newMessage=getCity();
        System.out.println(newMessage);
        int total=sum(3,5);
        System.out.println("sum:"+total);
        int summ=sum2(1,4,7,9,4,3,66);
        System.out.println(summ);
    }
    public  static void add(){
        System.out.println("Added");
    }
    public  static void delete(){
        System.out.println("Deleted");
    }
    public  static void update(){
        System.out.println("Updated");
        return;
    }
    public static int sum(int num1,int num2){
        return 5;
    }
    public static int sum2(int... numbers){
        int  summ=0;
        for(int num:numbers){
            summ=summ+num;

        }
        return summ;

    }

public static String getCity(){
        return "Istanbul";
}

}
