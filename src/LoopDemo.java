public class LoopDemo {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        System.out.println("For of Loop finished");
        //While
        int i=1;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("Loop of while finished");

        //Do-While
        int j=1;
        do{
            System.out.println(j);
            j++;
        }
        while (j<10);
    }
}
