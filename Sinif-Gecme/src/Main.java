import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Değişkenleri Tanımladık
        int mat, fizik, turkce, kimya, muzik;

        // Kullanıcıdan verileri istedik.
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        if ( (mat < 0) || (mat > 100)) {
            mat = 0;
        }

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        if ( (fizik < 0) || (fizik > 100)) {
            fizik = 0;
        }

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();
        if ( (turkce < 0) || (turkce > 100)) {
            turkce = 0;
        }

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        if ( (kimya < 0) || (kimya > 100)) {
            kimya = 0;
        }

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();
        if ( (muzik < 0) || (muzik > 100)) {
            muzik = 0;
        }

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;

        if ((avarage <= 0) || (avarage > 100)){
            System.out.println("Hatalı Veri Girdiniz : ");

        } else {
            if (avarage <= 55) {
                System.out.println("Sınıfta Kaldınız!");

            } else {
                System.out.println("Sınıfı Geçtiniz!");

            }
            System.out.println("Ortalamanız : " + avarage);
        }

    }
}