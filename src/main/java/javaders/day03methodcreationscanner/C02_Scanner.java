package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana
        // yazdiran programi yaziniz

        // % Modulus operatoru sayinin bolumunden kalan sayiyi verir

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi = input.nextInt(); //8649

        int sonRakam = sayi % 10;
        sayi = sayi / 10;
        int sondanIkinciRakam = sayi % 10;
        sayi = sayi / 10;
        int sondanUcuncuRakam = sayi % 10;
        sayi = sayi / 10;
        int ilkRakam = sayi % 10;
        sayi = sayi / 10;

        //int ilkRakam = sayi /1000; // ilk rakam boyle de yazilabilir

        System.out.println("ilkRakam + sonRakam = " + (ilkRakam + sonRakam));


    }
}
