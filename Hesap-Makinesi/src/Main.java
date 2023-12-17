import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenleri Tanımlama.
        int s1, s2, select, result;

        //Kullanıcıdan verileri alma.
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        s1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        s2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                result = s1 + s2;
                System.out.print("Sonuç : " + result);
                break;
            case 2:
                result = s1 - s2;
                System.out.print("Sonuç : " + result);
                break;
            case 3:
                result = s1 * s2;
                System.out.print("Sonuç : " + result);
                break;
            case 4:
                result = s1 / s2;
                System.out.print("Sonuç : " + result);
                break;
            default:
                System.out.print("Hatalı Giriş Yaptınız! ");
        }
    }
}