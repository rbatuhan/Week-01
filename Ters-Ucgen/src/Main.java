import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri Tanımlama.
        int basamakSayi;

        //Kullanıcıdan veri alma.
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Basamak Sayısını Giriniz : ");
        basamakSayi = input.nextInt();

        for (int i = basamakSayi; i > 0; i--){
            for (int k = basamakSayi - i; k > 0; k--){
                System.out.print(" ");
            }
            for (int m = 2 * i - 1; m > 0; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}