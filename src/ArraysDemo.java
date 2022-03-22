public class ArraysDemo {
    public static void main(String[] args) {
        String Student1="Aynur";
        String Student2="Hoji";
        String Student3="Zeynep";
        String Student4="Havva";
        System.out.println(Student1);
        System.out.println(Student2);
        System.out.println(Student3);
        System.out.println(Student4);
        System.out.println("------------------");
        String[] Students=new String[4];
        Students[0]="Ayşe";
        Students[1]="Ahmed";
        Students[2]="Mami";
        Students[3]="Nur";
        for(int i=0;i< Students.length;i++){
            System.out.println(Students[i]);

        }
        System.out.println("-------------");
        for(String Student:Students){
           System.out.println(Student);
        }

    }
}
