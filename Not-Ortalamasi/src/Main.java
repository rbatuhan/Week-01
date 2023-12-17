import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluşturalım.
        int mat, fizik, kimya, turkce, tarih, muzik;

    // Scanner sınıfımıı tanımlama.
    Scanner inp = new Scanner(System.in);

    // Kullanıcıdan değerleri alma.
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc1 = toplam / 6;
        System.out.println("Ortalamanız : " + sonuc1 );

        boolean kosul = sonuc1 >= 60;
        String str = (kosul) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print( str);
    }
}