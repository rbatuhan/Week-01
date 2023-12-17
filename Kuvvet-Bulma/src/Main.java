import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri Tanımlayalım
        int sayi;

        Scanner input = new Scanner(System.in);

        do {
            // Kullanıcıdan verileri alma.
            System.out.print("Bir Sayı Giriniz : ");
            sayi = input.nextInt();
        } while (sayi <= 0);
        System.out.print("4 Sayısının Katları : ");
        for ( int i = 1; i < sayi; i *= 4) {
            System.out.print(i + " ");
        }
        System.out.print("\n5 Sayısının Katları : ");
        for ( int i = 1; i < sayi; i *=5) {
            System.out.print(i + " ");
        }
    }
}