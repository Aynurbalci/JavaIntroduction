package ExamExercises7;

enum Book {
    ALICE_HARIKALAR(150, "ada yayin"),
    SEFILLER(34, "yapi yayin"),
    FARELER_VE_INSANLAR(56, "sjfkl");
    int pageNum;
   private String descp;

    Book(int number, String descpription) {
        this.pageNum = number;
        this.descp = descpription;
    }
    public String getDescp(){
        return  descp;
    }

}

public class Enum {

    Book book;

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        Book[] books = Book.values();
        for (Book b : books) {
            System.out.println(b+" "+b.pageNum+"  "+b.getDescp());
        }
    }

}
