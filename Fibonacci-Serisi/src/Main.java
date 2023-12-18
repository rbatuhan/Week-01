import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri atama.
        int t1 = 0, t2 = 1, t, e;

        // Kullanıcıdan veri alma.
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısını Giriniz : ");
        e = input.nextInt();

        System.out.println("Girilen " + e + " Sayısının Finacci Serisi" );
        for (int i = 0; i <= e; i++) {
            System.out.print(t1 + " ");
            t = t1 + t2;
            t1 = t2;
            t2 = t;
        }
    }
}