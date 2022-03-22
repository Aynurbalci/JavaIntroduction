package ExamExercises10;

public class Rectangle {
    int x,y,weight,height;

    public Rectangle(){
        this.x=0;
        this.y=0;
        this.weight=1;
        this.height=1;
        //this(1,1);
    }
    public Rectangle(int weight,int height){
        this.x=0;
        this.y=0;
        this.height=height;
        this.weight=weight;
        //this(0,0,weight,height);
    }
    public Rectangle(int x,int y,int weight,int height){
        this.x=x;
        this.y=y;
        this.weight=weight;
        this.height=height;
    }

    public  void displayInfo(){
        System.out.printf("x: %d y: %d w: %d h: %d %n",x,y,weight,height);

    }
}
