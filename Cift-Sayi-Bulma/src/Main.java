import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişken Tanımlama.
        int sayi, sayac, toplam, i = 0;
        //Kullanıcıdan Veri alma
        Scanner input = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz");
        sayi = input.nextInt();

        toplam = 0;
        sayac = 0;
        while (i < sayi){
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sayac++;
                toplam = toplam + i;
            }
            i++;
        }
        System.out.println("Ortalama : " + (toplam / sayac));
    }
}