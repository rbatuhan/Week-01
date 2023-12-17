import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkeni Tanımladık.
        int heat;

        // Kullanıcıdan verileri istedik.
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat >= 25) {
            System.out.println("Yüzmeye Gitmenizi Öneririm. ");
        }
        else if (heat < 25 && heat >= 15) {
            System.out.println("Piknik Yapmaya Gitmenizi Öneririm.");
        }
        else if (heat < 15 && heat >= 5) {
            System.out.println("Sinemaya Gitmenizi Öneririm. ");
        }
        else {
            System.out.println("Kayak Yapmaya Gitmenizi Öneririm. ");
        }
    }
}