import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri Tanımlama.
        int toplam = 0, sayi;

        // Kullanıcıdan verileri alma.
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Giriniz : ");
            sayi = input.nextInt();

            if ((sayi % 2 == 0) && (sayi % 4 ==0)) {
                toplam = toplam + sayi;
            }
        } while ( sayi % 2 == 0);

        System.out.println(" 2 ve 4 ün katı olan sayıların toplamı : " + toplam);
    }
}