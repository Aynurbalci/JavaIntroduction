package School;

import java.util.Scanner;

public class week3Sayisal {
    public static void main(String[] args) {
        int toplam = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayıyı girin");
        int sayi = scanner.nextInt();
        int mod = sayi % 10;
        System.out.println("basamak");
        int basamak = scanner.nextInt();

        for (int i = 0; i < basamak; i++) {

            toplam = toplam + sayi % 10;
            sayi = sayi / 10;
        }
        System.out.println(toplam);


    }
}
