import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri atayalım.
        int n, sayi, min, max;

        // Kullanıcıdan verileri alalım.

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Adet Sayı Giriceksiniz : ");
        n = input.nextInt();

        if (n <= 0) {
            System.out.println("Hatalı Veri Girdiniz!");
        }
        else {
            System.out.print("1. Sayıyı Giriniz: ");
            sayi = input.nextInt();

            max = sayi; min = sayi;

            for (int i = 2; i <= n; i++) {
                System.out.print(i + ". Sayıyı Giriniz: ");
                sayi = input.nextInt();

                if (sayi > max) { max = sayi; }
                else if (sayi < min) { min = sayi; }

            }
            System.out.println("En Büyük Sayı : " + max);
            System.out.println("En Küçük Sayı : " + min);
        }
    }
}