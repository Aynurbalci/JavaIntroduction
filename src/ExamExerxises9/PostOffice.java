package ExamExerxises9;

public class PostOffice {
    private String name;
    public PostOffice(String name){
        this.name=name;
    }
    Post [] posts;

   void Send(Post Post){
       System.out.printf(" %s from %s to %s by %s",Post.sourceAddress,Post.targetAddress,Post.message,this.name);

    }
    void receive(Post Post){
        System.out.printf(" %s from %s to %s by %s",Post.sourceAddress,Post.targetAddress,Post.message,this.name);

    }

}
