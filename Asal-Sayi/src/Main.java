import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişken tanımlama.
        int sayi;

        // Kullanıcıdan veri alma.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        sayi = input.nextInt();

        for ( int i = 2; i <= sayi; i++) {
            boolean asal = true;

            for (int b = 2; b < i; b++) {
                if(i % b == 0) {
                    asal = false;
                }
            }
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}