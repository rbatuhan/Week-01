import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri Tanımlama.
        int a, b, c, sonuc;

        // Kullanıcıdan veri isteme
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        a = inp.nextInt();
        System.out.print("Bir Sayı Giriniz : ");
        b = inp.nextInt();
        System.out.print("Bir Sayı Giriniz : ");
        c = inp.nextInt();

        sonuc = a+b*c-b;
        System.out.print("Aritmetik İşlem Sonucu : " + sonuc);

    }
}