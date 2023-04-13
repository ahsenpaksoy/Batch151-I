package javaders.day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van", "MUS", "Gumushane", "Kutahya", "Ankara", "MUS", "Ordu", "Gaziantep", "Hatay", "Edirne"));
        bykHarfLengthArtanDistinct(iller);
        System.out.println();
        bykHarfSonHarfArtanDistinct(iller);
        System.out.println();
        bykHarfLengthArtanDistinctLengthAlfabetikSira(iller);
        System.out.println();
        System.out.println(krktrSysBesFzlOlanlariSil(iller));
        System.out.println();
        System.out.println(hIleBaslayanOrUIleBitenElSil(iller));
        System.out.println();

    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHarfLengthArtanDistinct(List<String> iller) {
        System.out.print("1) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));
    }

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHarfSonHarfArtanDistinct(List<String> iller) {
        System.out.print("2) ");
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()). //Bu yapiya Lambda Expression demisler
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                forEach(t -> System.out.print(t + " "));
    }

    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void bykHarfLengthArtanDistinctLengthAlfabetikSira(List<String> iller) {
        System.out.print("3) ");
        iller.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println); //Lambda Expression'da forEach(t-> System.out.print(t + " ")); seklinde
    }
    //method reference de forEach(System.out::println); bu sekilde yazilir.
    //Method Reference yontemi kullandik methodlar icin

    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz
    public static List<String> krktrSysBesFzlOlanlariSil(List<String >iller){
        System.out.print("4) ");
        iller.removeIf(t->t.length()>5);

        return iller;

        //Note:Bazi durumlarda stream methodu aradigimiz methodlari vermez bu nedenle akisa sunmadan
        // "iller." dedikten sonra removeIf() kullandik
        //  Note 2: removeIf() methodu silme islemi bir sarta bagli ise kullaniriz
    }

        // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz
        public static List<String> hIleBaslayanOrUIleBitenElSil(List<String >iller){
            System.out.print("5) ");
            iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));

            return iller; //list oldugu icin return oldu

        }


        // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin


        //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.


}

/*
     sorted()==> 2 turlu kullanimi vardir.
     i) Icerisine arguman verilmezse,burada oldugu gibi
        sorted()natural order'a gore kucukten buyuge dogal siralaam yapar
     ii) sorted(Comparator) icerisine arguman verilirse bizim belirledigimiz parametreye gore siralama yapar
 */
