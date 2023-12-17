import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri tanımlama.
        double kilo, boy, kitle;


        // Kullanıcıdan verileri alma.
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu (kg cinsinden) giriniz : ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        kitle = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + kitle);
    }
}