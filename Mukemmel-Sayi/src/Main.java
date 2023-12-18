import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri Tanımlama
        int sayi, toplam = 0;

        // Kullanıcıdan verileri alma.
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        sayi = input.nextInt();

        if (sayi > 0){
            for (int i = 1; i < sayi; i++){
                if (sayi % i ==0) {
                    toplam = toplam + i;
                }
            }
            if (toplam == sayi){
                System.out.println(sayi + " Bu Bir Mükemmel Sayıdır.");
            }
            else {
                System.out.println(sayi + " Bu Bir Mükemmel Sayı Değildir.");
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}