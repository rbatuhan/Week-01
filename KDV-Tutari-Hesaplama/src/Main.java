import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri tanımlama.
        double tutar, kdvOran;

        // Girdi isteme.
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Girini : ");
        tutar = input.nextDouble();

         kdvOran =  (tutar < 1000)? 0.18 : 0.08;

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutarı : " + kdvliTutar);
    }
}