import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri atayalım.
        int a, b, c;

        // Kullanıcıdan verileri alalım
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz : ");
        a = input.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        b = input.nextInt();

        System.out.print("3. Sayıyı Giriniz : ");
        c = input.nextInt();

        if ( !(a == b) && !(b == c) && !(a == c)){
            if ((a < c) && (a < b)) {
                if (b < c){
                    System.out.print("Girdiğiniz Sayıların Sıralması : " + "a<b<c : " + a + "<" + b + "<" + c);
                } else {
                    System.out.print("Girdiğiniz Sayıların Sıralması : " + "a<c<b : " + a + "<" + c + "<" + b);
                }
            }
            else if ((b < a) && (b < c) ) {
                if (a < c) {
                    System.out.print("Girdiğiniz Sayıların Sıralması : " + "b<a<c : " + b + "<" + a + "<" + c);
                } else {
                    System.out.print("Girdiğiniz Sayıların Sıralması : " + "b<c<a : " + b + "<" + c + "<" + a);
                }
            }
            else if ((c < a) && (c < b)) {
                if (a < b) {
                    System.out.print("Girdiğiniz Sayıların Sıralması : " + "c<a<b : " + c + "<" + a + "<" + b);
                } else {
                    System.out.print("Girdiğiniz Sayıların Sıralması : " + "c<b<a : " + c + "<" + b + "<" + a);
                }
            }
        }
        else {
            System.out.println("Hatalı Sayı Girdiniz!");
        }
    }
}