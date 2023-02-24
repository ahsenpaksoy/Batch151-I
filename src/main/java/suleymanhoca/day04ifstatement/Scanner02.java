package suleymanhoca.day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
    char variable lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
    Java da "+" sembolu toplama ve birlestirme yapar.
     */
    public static void main(String[] args) {

        // Ex : Kullanicidan ilk ve soy ismini aliniz, ilk ve soy ismin ilk harflerini ekrana yazdiriniz
        //      Ali Can ==> AC

        Scanner input = new Scanner(System.in);

        //1. yol
        System.out.println("Ilk isminizi yaziniz...");
        char first = input.next().charAt(0);

        System.out.println("Soy isminizi giriniz...");
        char second = input.next().charAt(0);

        System.out.println(first + second); // char karakterlerin ascii degerinin toplamini verir
        System.out.println("first + second = " + first + second);

        // 2. yol
        System.out.println("Tam isminizi giriniz...");
        String tamIsim = input.nextLine();
        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);

        System.out.println("ilkHarf + soyIsminIlkHarfi = " + ilkHarf + soyIsminIlkHarfi);


    }
}
