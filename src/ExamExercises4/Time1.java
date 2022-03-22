package ExamExercises4;

public class Time1 {
    private int hour;
    private int minute;
    private int second;
     public Time1(int hour,int minute,int second){


         setHour(hour);
         setMinute(minute);
         setSecond(second);


     }
     public void setHour(int hour){
         if(hour<0 || hour>23)
             throw new IllegalArgumentException("hour must be in 0-23");
         this.hour=hour;

     }
     public void setMinute(int minute){
         if(minute<0 || minute>59)
             throw new IllegalArgumentException("minute must be in 0-59");
         this.minute=minute;
     }
     public void setSecond(int second){
         if(second<0 || second>59)
             throw new IllegalArgumentException("second must be in 0-59");
         this.second=second;
     }
     public String toString(){
         return String.format("%02d : %02d : %02d",this.hour,this.minute,this.second);
     }


}
