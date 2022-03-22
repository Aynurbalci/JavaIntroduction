package School;


public class Week2 {
    String Name;
    int mid;
    float FinalExam;
  public Week2(
          String Name,
          int mid,
          float FinalExam
  ){
    //  this.Name="Haji";
      this.Name=Name;//global vs private
      this.mid=100;
      this.FinalExam=100;

  }




     float calcScore(
             String Name,
             int mid,
             float FinalExam

     ){
            return (float) (mid*0.4+FinalExam*06f);
        }
        void StudentsInformation(){

            System.out.println("Score:"+calcScore("Aynur",90,80.0f));

}


}
