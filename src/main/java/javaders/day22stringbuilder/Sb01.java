package javaders.day22stringbuilder;

public class Sb01 {

    /*
        1)"StringBuilder" String ureten bir Class'dir.
        2)"String" Class kullanarak String uretiriz Java nicin "StringBuilder" Class'i da olusturdu?
          "String" Clas "immutable"(degistirilemez) String uretir, "StringBuilder" Class "mutable"(degistirilebilir) String uretir.
        3)"immutable" olmak demek orijinal degerin korunmasi, degistirilemez olmasi demektir.
          "mutable" olmak demek orijinal degerin degistirilebilir olmasi demektir.
        4)"capacity" Java'nin size verdigi data depolama yer sayisidir.
           Length ise size verilen data depolama yerinin kullanilan kismidir.
        5)Java baslangic olarak size capacity'i 16 olarak verir.
          Siz verilen capacity'i asarsaniz Java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir.
     */
    public static void main(String[] args) {
        String s = "Java";

        s = s + "!";

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        //StringBuilder nasil olusturulur?

        //1.Way:
        StringBuilder t = new StringBuilder("Pyhton");
        System.out.println(t);//Pyhton

        //StringBuilder'lara nasil ekleme yapilir?
        t.append("!").append("...");
        System.out.println(t);//Pyhton!...

        //2.Way:
        StringBuilder r = new StringBuilder();
        System.out.println();

        r.append('c');
        System.out.println(r);//c

        //"capacity" ve "length" arasindaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();
        System.out.println(capacity); //21

        int length = sb1.length();
        System.out.println(length); //5

        sb1.append("!").append(".................");

        int c = sb1.capacity();
        System.out.println(c); // 21*2 + 2 ==> 44

        int ln = sb1.length();
        System.out.println(ln); //23

        //Default capacity'i degistirebilir miyiz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity()); //2

        sb2.append("...");
        System.out.println(sb2.capacity());





    }

}
