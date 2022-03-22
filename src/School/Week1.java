package School;

public class Week1 {
    public static void main(String[] args) {
        String Name="Aynur";
        int mid=10;
        int Final=23;
        StudentsInformation(Name,mid,Final);
    }
    static float calcScore(int a,int b){
        return a*0.4f*b;
    }
    static void StudentsInformation(String a,int b,int f){
        float score=calcScore(b,f);
        System.out.println("Name "+a+"Score "+score);

    }
}
