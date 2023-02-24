package suleymanhoca.day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdirin
        // Ramazan  Rn
        Scanner input = new Scanner(System.in);
        //System.out.println("Lutfen isminizi giriniz...");
        //String name = input.next();

        //1. Yol:
        //char firstLetter = name.charAt(0);
        //char lastLetter = name.charAt(name.length()-1);// Yazdiginiz code sadece bazi durumlar icin calisirsa o code a "Hard Coding" denir.
                                                       //Yazdiginiz code her durum icin calisirsa o code a "Dynamic Coding" denir.
        //System.out.println(firstLetter + lastLetter); // char larin arasinda matematiksel islem kullanirsaniz java ascii degerlerini alir.
        //System.out.println("" + firstLetter + lastLetter);
        //System.out.println("firstLetter + lastLetter = " + firstLetter + lastLetter);

        //2. Yol:
        //String first = name.substring(0,1);
        //String last = name.substring(6,7);
       // String last = name.substring(name.length()-1);
        //System.out.println(first + last);

        //Examole 2: Verilen String deki sadece hayvan isimlerini ekrana yazdiriniz.
        //           "Ben kedi, esim tavuk, oglum sever inek"
        String str = "Ben kedi, esim tavuk, oglum sever inek";

        //substring() in iki kullanimi vardir.
        //1) substring(baslangic indexi, bitis indexi) String in ortasindan bir parca almaya yarar
        //2) substring(baslangic indexi) String in verilen indexten sonuna kadar almaya yarar
        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        //String inek = str.substring(34,38);
        String inek = str.substring(34); // 34 den baslar sonuna kadar alir
        System.out.println(kedi + tavuk + inek);

        //Example 3: Ilk isim ve soy isimi iceren isimlerden ilk ve soyisimlerin bas harflerini ekrana yazdiriniz
        //             Ali Can ==> AC
        System.out.println("Ilk ve soy isminizi giriniz");
        String fullName = input.nextLine();
        String a = fullName.substring(0,1);
        String b = fullName.split(" ")[1].substring(0,1);
        System.out.println(a + b);


    }
}
