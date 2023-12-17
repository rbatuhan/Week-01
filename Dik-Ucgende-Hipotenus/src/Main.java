import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluşturalım.
        int a, b, c, cevre;
        double alan;

        //Kullanıcıdan verilerimizi alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = girdi.nextInt();
        System.out.print("3. Kenarı Giriniz : ");
        c = girdi.nextInt();

        cevre = (a+b+c)/2;

        alan = Math.sqrt(cevre*(cevre-a)*(cevre-b)*(cevre-c));
        System.out.println("Üçgenin Alanı : " + alan);
    }
}