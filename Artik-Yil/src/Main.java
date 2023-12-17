import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri Tanımlama
        int yil;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı Giriniz : ");
        yil = input.nextInt();
        if ((yil % 100) == 0 ) {
            if ((yil % 400) == 0) {
                System.out.println(yil + " Artık Yıldır");
            } else {
                System.out.println(yil + " Artık Yıl Değildir");
            }
        } else if ((yil % 4) == 0) {
            System.out.println(yil + " Artık Yıldır");
        } else {
            System.out.println(yil + " Artık Yıl Değildir");
        }
    }
}