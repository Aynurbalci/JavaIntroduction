public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Perfect you are passed");
                break;
            case 'B':
                System.out.println("Very Good you are passed");
                break;
            case 'C':
                System.out.println("Good you are passed");
                break;
            case 'D':
                System.out.println("Good you are passed");
                break;
            case 'F':
                System.out.println("Unfortunately you aren't passed");
                break;
            default:
                System.out.println("Invalid Note");


        }
    }
}
