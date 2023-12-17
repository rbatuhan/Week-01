import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Değişkenleri Tanımlama.
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5, tutar;
        double a, e, d, m, p;

        // Kullanıcıdan verileri isteme.
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo : ");
        a = input.nextDouble();

        System.out.print("Elma kaç kilo : ");
        e = input.nextDouble();

        System.out.print("Domates kaç kilo : ");
        d = input.nextDouble();

        System.out.print("Muz kaç kilo : ");
        m = input.nextDouble();

        System.out.print("Patlıcan kaç kilo : ");
        p = input.nextDouble();

        tutar = ((armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlıcan*p));
        System.out.print("Toplam Tutar : " + tutar);
    }
}