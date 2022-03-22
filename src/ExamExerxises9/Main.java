package ExamExerxises9;

public class Main {
    public static void main(String[] args){

      Post post=new Post("mypost","istanbu","sad");
      PostOffice postOffice=new PostOffice("Aynur");
      PostOffice postOffice1=new PostOffice("Hoji");
      postOffice1.receive(post);
      postOffice.Send(post);


    }
}
