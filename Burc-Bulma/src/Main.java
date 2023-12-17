import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişlenleri tanımlayalım..
        int month, day;

        // Kullanıcıdan verileri alalım.
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı Giriniz : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Günü Giriniz : ");
        day = input.nextInt();

        if ((month > 0 && month < 13) && (day > 0 && day < 31)) {
            if ((month == 3 && day >= 21) || (month == 4 && day <= 20)){
                System.out.println("Burcunuz : Koç");
            } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
                System.out.println("Burcunuz : Boğa ");
            } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
                System.out.println("Burcunuz : İkizler");
            } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
                System.out.println("Burcunuz : Yengeç");
            } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                System.out.println("Burcunuz : Aslan");
            } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                System.out.println("Burcunuz : Başak");
            } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
                System.out.println("Burcunuz : Terazi");
            } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                System.out.println("Burcunuz : Akrep");
            } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
                System.out.println("Burcunuz : Yay");
            } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
                System.out.println("Burcunuz : Oğlak");
            } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
                System.out.println("Burcunuz : Kova");
            } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
                System.out.println("Burcunuz : Balık");
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}