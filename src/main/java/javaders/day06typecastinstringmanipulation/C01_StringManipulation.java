package javaders.day06typecastinstringmanipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {

        String a = "Benim Tek Rakibim Dunku Ben*." ;

        //**************** toUpperCase() **********************\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);

        //**************** tolowerCase() **********************\\
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);

        //**************** charAt() **********************\\
        System.out.println("ilk karakter : " + a.charAt(0));
        System.out.println(a.charAt(10));

        // a String indeki bastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yazdiriniz
        char firstChar = a.charAt(1);
        System.out.println("firstChar = " + firstChar);
        char lastSecondChar = a.charAt(20);
        System.out.println("lastSecondChar = " + lastSecondChar);
        System.out.println("firstChar + lastSecondChar = " + firstChar + lastSecondChar);

        //**************** length() **********************\\
        // a String inde bulunan karakter seyisini bulunuz
        int aLength = a.length();
        System.out.println("aLength = " + aLength);

        //**************** subString() **********************\\
        // a String indeki ilk 4 karakteri aliniz
        String sub1 = a.substring(0,4);
        System.out.println("sub1 = " + sub1);

        //a String indeki 4. index dahil 7. index haric yazdirin
        String sub2 = a.substring(4,7);
        System.out.println("sub2 = " + sub2);


        //a String indeki "Rakib" kelimesini aliniz
        System.out.println(a.substring(10, 15));

        System.out.println(a.substring(10)); //Rakibim Dunku Ben*.  Verilen indexten sonrasini alir

        //**************** contains() **********************\\
        //a String inde "bim" kelimesinin olup olmadigini kontrol ediniz
        boolean varMi = a.contains("bim");
        System.out.println("varMi = " + varMi); //true


        //**************** startsWith() **********************\\
        //a String inin "T" harfiyle baslayip baslamadigini kontrol ediniz
        System.out.println(a.startsWith("T")); //false
        System.out.println(a.startsWith("Tek", 6)); // true  Ilk 6 karakteri at, sonrasi "Tek" kelimesiyle basliyor mu?
        //prefix : baslangic , offset : at gitsin

        // Universite numaralari yil + BolumKodu + GirisSirasi  olarak duzenlenen bir okulda ogrenci Umran in
        // Hukuk Fakultesinde okuyup okumadigini gosteren kodu yaziniz

        /*
        sinif  22  Hukuk 33  Bilgisayar 44  Eczacilik 55  Maliye 66  KimyaMuhendisligi 77  olsun
         */

        String str = "20103301";
        System.out.println(str.startsWith("33", 4)); //true




    }
}
