import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri Tanımlıyoruz.

        String userName, password, password2, request;

        // Kullanıcıdan verileri alıyoruz.
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı giriniz : ");
        userName = input.nextLine();

        System.out.print("Sifre giriniz : ");
        password = input.nextLine();

        //Alınan verilerin doğruluğunu sorgulama.
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Sifre Doğru, giriş yaptınız.");

        } else {
            System.out.println("Yanlış şifre girdiniz.");

        }
        System.out.println("Şifrenizi sıfırlamak ister misniz? : \nevet/hayır");
        System.out.println("e/h");
        String a = input.nextLine();

        String password3;
        switch (a) {
            case "e":
                System.out.println("Yeni Sifre giriniz : ");
                password2 = input.nextLine();

                //Alınan verilerin tekrar doğruluğunu sorgulama
                if (password2.equals("java123")) {
                    System.out.println("Eski şifre ile aynı olmamalıdır.");
                    System.out.println("Tekrar deneyin");
                    password3 = input.nextLine();

                    if (password3.equals("java123")) {
                        System.out.println("Eski şifre ile aynı olmamalıdır. tekrar deneyin.");
                    }else {
                        System.out.println("Yeni şifre ile giriş yaptınız");
                    }
                }
                break;
            case "h":
                System.out.println("Çıkış Yaptınız. ");
                break;
            default:
                System.out.println("e/h değeri giriniz");
        }
    }
}