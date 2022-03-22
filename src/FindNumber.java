public class FindNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 5, 8, 9, 0};
        int search = 5;
        boolean IsThere = false;
        for (int searc : numbers) {
            if (search == searc) {
                IsThere = true;
                break;
            }
        }
        if(IsThere){
            System.out.println("Number is available");

        }
        else{
            System.out.println("Number isn't available");
        }
    }
}
