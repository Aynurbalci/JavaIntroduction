package Week6;
 enum Branch {
    MATH(1),
    GEO(2),
    CS(3),
    ENG(4);
    private int a;

    private Branch(int b) {
        this.a = b;
    }

    public int B() {
        return a;
    }


}
public class Teacher {



    public int id;
    public Branch branch;


     Teacher(int Id, Branch branch) {
        this.id = Id;
        this.branch = branch;


    }


    public static void main(String[] args) {
        Branch[] branches = Branch.values();
        Teacher teacher = new Teacher(1, Branch.CS);
        Teacher teacher1 = new Teacher(2, Branch.ENG);
        Teacher teacher2 = new Teacher(3, Branch.GEO);
        Teacher teacher3 = new Teacher(4, Branch.MATH);

        Teacher[] tech = {teacher, teacher1, teacher2, teacher3};
        for (Teacher t : tech) {

            System.out.println(t);

        }
    }


}
