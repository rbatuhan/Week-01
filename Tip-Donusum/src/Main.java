import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişken Tanımlayıp, Kullanıcıdan veri alalım

        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı girin: ");
        int tSayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı girin: ");
        double dSayi = input.nextDouble();

        //Dönüşüm yapma
        
        int tSayiDonusum = (int) dSayi;
        double dSayiDonusum = (double) tSayi;

        System.out.println("Bir Tam Sayının Ondalıklı Sayıya Dönüşümü : " + (double) tSayi);
        System.out.println("Bir Ondalıklı Sayının Tam Sayıya Dönüşümü : " + (int) dSayi);
    }
}