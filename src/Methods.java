public class Methods {
    public static void main(String[] args) {
        SearchNumber();
        SearchNumber();
        SearchNumber();
        SearchNumber();
    }

    public static void SearchNumber() {

        int[] numbers = new int[]{1, 2, 3, 5, 8, 9, 0};
        int search = 5;
        boolean IsThere = false;
        for (int searc : numbers) {
            if (search == searc) {
                IsThere = true;
                break;
            }
        }
        String message="";
        if (IsThere) {
           // System.out.println("Number is available");
            message="Message is available"+search;
            getMessage(message);

        } else {
            System.out.println("Number isn't available"+search);
        }

    }
    public static void getMessage(String Message ){
        System.out.println(Message);
    }
}
