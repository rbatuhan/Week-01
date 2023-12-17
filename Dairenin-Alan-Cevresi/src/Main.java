import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri Tanımlama.
        int r;
        double pi = 3.14, a;

        // Kullanıcıdan veri alma.

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = inp.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz :  ");
        a = inp.nextDouble();


        double alan2 = (pi*(r*r)*a) / 360;
        System.out.println("Dairenin dilim alanı : " + alan2 );
        double cevre = (2 * pi * r);
        System.out.println("Dairenin çevresi : " + cevre);
        double alan = (pi * r * r);
        System.out.println("Dairenin alanı : " + alan);
    }
}