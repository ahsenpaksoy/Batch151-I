package javaders.mete.o1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        List<Book> kutuphane = makeLibrary();
        getYazarBooks(kutuphane, "Ahsen YILDIRIM");

    }


    private static List<Book> makeLibrary() {
        List<Book> kutuphane = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {

            kutuphane.add(new Book(rastGeleKitapAdiUret(),rastGeleYazarAdiUret()));
        }
        return kutuphane;
    }

    private static void getYazarBooks(List<Book> kutuphane, String yazarADI) {
        for (Book b: kutuphane
             ) {
            if (b.getyName().equalsIgnoreCase(yazarADI)){
                b.kitabiYaz();
            }
        }
    }

    private static String rastGeleKitapAdiUret() {
        String[] ornekKitapAdlari1 = {"Benim", "Senin", "Onun", "Hey", "Iyi", "Kotu", "Guzel", "Bilmis", "Akilli", "Super"};
        String[] ornekKitapAdlari2 = {"Anne", "Baba", "Memleket", "Kardes", "Dayi", "Kedi", "Kopek"};

        String rastGeleKitapAdi = ornekKitapAdlari1[(int) (Math.random() * (ornekKitapAdlari1.length))] + " " + ornekKitapAdlari2[(int) (Math.random() * (ornekKitapAdlari2.length))];

        return rastGeleKitapAdi;
    }

    private static String rastGeleYazarAdiUret() {
        String[] ad = {"Ahsen","Mete","Esad","Sinem","Ejder","Ayse","Esra"};
        String[] soyad = {"Celebi","Kaba","Yildirim","Paksoy","Sadiklar","Karsli"};

        String rastGeleKitapAdi = ad[(int) (Math.random() * (ad.length))] + " " + soyad[(int) (Math.random() * (soyad.length))];

        return rastGeleKitapAdi;
    }


}
