import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // Değişkenleri Tanımlama.

        int n, r, toplam = 1, toplamN = 1, toplamR = 1, b, c;

        // Kullanıcıdan Verileri alma.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir n Değeri Giriniz : ");
        n = input.nextInt();

        System.out.print("Bir r Değeri Giriniz : ");
        r = input.nextInt();

        b = n - r;
        if ((r < 0) || (r > n)) {
            System.out.print("Geçersiz Veri Girdiniz" );
        }
        else {
            for (int i = 1; i <= n; i++) {
                // n değeri için faktoriyel hesaplama
                toplamN = toplamN * i;
            }
            for (int i = 1; i <= r; i++){
                // r değeri için faktoriyel hesaplama
                toplamR = toplamR * i;
            }
            for (int i = 1; i <= b; i++) {
                // (n-r) değeri için faktoriyel hesaplama
                toplam = toplam * i;
            }
            c = toplamN / (toplamR * toplam);
            System.out.print("n ve r değerinin kombinasyonu : " + c);
        }
    }
}