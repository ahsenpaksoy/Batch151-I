package suleymanhoca.day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /*
        Get the first name, middle name, lastname, SSN(kimlik numarasi) from user then print them like the following
        Ali Mert Can
        123456789
         */
        Scanner input = new Scanner(System.in);

        // 1. yol
        System.out.println("Lutfen ilk isminizi giriniz...");  // Toplu comment icin  (ctrl + <> tabi )
        String ilkIsim = input.next();
        System.out.println("Orta isminizi giriniz...");
        String ortaIsim = input.next();
        System.out.println("Soy isminizi giriniz...");
        String soyIsim = input.next();
        System.out.println("Kimlik numaranizi giriniz...");
        String kimlikNo = input.next();
        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);


        // 2. yol
        System.out.println("Ilk, orta, soy isminizi ve kimlik numaranizi giriniz...");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

        // 3. yol
        System.out.println("Ilk, orta ve soy isminizi giriniz...");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);
        System.out.println("Kimlik numaranizi giriniz");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);









    }
}
