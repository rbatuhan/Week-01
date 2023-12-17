import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri Tanımlayalım.
        int a, b, sonuc = 1;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan verileri alalım
        System.out.print("Taban Değerini Giriniz : ");
        a = input.nextInt();

        System.out.print("Üs Değerini Giriniz : ");
        b = input.nextInt();

        for (int i = 1; i <= b; i++) {

            sonuc = sonuc * a;

        }

        System.out.print("Üs Sonucu : " + sonuc);
    }
}