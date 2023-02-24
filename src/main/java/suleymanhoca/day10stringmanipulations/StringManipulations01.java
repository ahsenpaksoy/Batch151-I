package suleymanhoca.day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java kolaydir.";

        boolean b = a.startsWith("va",2);
        System.out.println("b = " + b);//true  2. karakterden sonra ne ile baslar
        boolean b1 = a.startsWith("kola",5);
        System.out.println("b1 = " + b1);//true
        //startsWith("kola",5) kodu ilk 5 karakterden sonraki String e bakar ve String in "kola" ile baslayip baslamadigini
        //kotrol eder."kola" ile basliyorsa "true", baslamiyorsa "false" return eder.

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
        //replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
        String c = a.replaceFirst("a","*");// ilk a'nin yerine "*" koy
        System.out.println("c = " + c);//J*va kolaydir.

        //concat() method'u iki tane String i birbirine yapistirmaya yarar.
        //"Concatenation2 islemi iki tur yapilabilir; i)+ ile ii) concat() ile
        //Java bir islem icin method uretmisse o method u kullanmak "best practice" dir.
        String d = a.concat(" Anladin mi?");
        System.out.println("d = " + d);//Java kolaydir. Anladin mi?

        String e = "   Tom Hanks    ";
        System.out.println("e = " + e);// "Tom Hanks    "

        //trim() methodu bir String'in bas ve sondaki "space" karakterlerini siler, aradaki "space" karakterlerine dokunmaz
        String f = e.trim();
        System.out.println("f = " + f);//"Tom Hanks"

        String h = "Java";
        String i = "Java";

        //h.compareTo(i); kodu iki tane String'i alfabetik olarak karsilastirir.
        //Buyuk harf e duyarlidir.
        //Buyuk harf kucuk harfe duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h" nin alfabetik sirasindan "i" nin alfabetik sirasi cikarilir.
        int k = h.compareTo(i);
        System.out.println("k = " + k);//0

        String h1 = "Java";
        String i1 = "Lava";
        int k1 = h1.compareTo(i1);
        System.out.println("k1 = " + k1);// -2

        //a.repeat(3) kodu a String ini yan yana 5 kere yapistirir
        //Java Dctrl  ye basili tut
        String n = a.repeat(3);
        System.out.println("n = " + n);

        String n1 = a.repeat(0);
        System.out.println("n1 = " + n1);
        //repeat(0); empty String return eder.


    }
}
