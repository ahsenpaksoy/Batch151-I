package practices.lambda_recap;

import java.util.*;
import java.util.stream.Collectors;
public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftVePozitifLamExYazdir(sayi);
        System.out.println(" \n  *******");
        ciftVePozitifMetRef(sayi);
        System.out.println(" \n  *******");
        kareYazdir(sayi);
        System.out.println(" \n  *******");
        kareTekrarsiz(sayi);
        System.out.println(" \n  *******");
        buyKucSirala(sayi);
        System.out.println(" \n  *******");
        pozitifKupBirlerBas5(sayi);
        System.out.println(" \n  *******");
        toplamMetRef(sayi);
        System.out.println(" \n  *******");
        toplamLambaEx(sayi);
        System.out.println(" \n  *******");
        System.out.println(ciftElKareKucBuySirListReturn(sayi));
    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){
        sayi.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t + " "));
    }
    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifMetRef(List<Integer> sayi){
        sayi.stream().filter(t->t%2==0 && t>0).forEach(Utils::yazdir);
    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi){
        // sayi.stream().map(t->t*t).forEach(Utils::yazdir);
        sayi.stream().map(Utils::kareBul).forEach(Utils::yazdir);
    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTekrarsiz(List<Integer> sayi){
        sayi.stream().map(Utils::kareBul).distinct().forEach(Utils::yazdir);
    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucSirala(List<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
    }
    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupBirlerBas5(List<Integer> sayi){
        sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);
    }
    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamMetRef(List<Integer> sayi){
        Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);
        System.out.println(sonuc);
    }
    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamLambaEx(List<Integer> sayi){
        int sonuc = sayi.stream().reduce(0,(a,b)->a+b);
        System.out.println(sonuc);

        //toplama isleminde 0 etkisiz eleman oldugundan identity kismini baslangic olarak 0 aldik.
        // a her zaman degerini identity'den b ise degerini akistan alir.
        //Bir onceki soruda Method Reference kullandigimiz icin list elemanlarinin toplamini bir int'e assign ettigimizde
        //kizarmis ve Optional'a cevirmisti ama burda hata vermedi cunku hicbir deger olmasa bile elimizde baslangic olarak 0 mevcut.
    }
    //SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> ciftElKareKucBuySirListReturn(List<Integer> sayi){
        List<Integer> sonuc = sayi.stream().filter(t->t%2==0).map(Utils::kareBul).sorted().collect(Collectors.toList());
        return sonuc;

    }
}
      // Lambda, map harici butun collectionlarda kullanilir.Map'lerde key value iliskisi oldugu icin kullanamayiz
      // Optional yapma sebebi :listin icerisinde hicbir eleman yoksa null olacagi icin ve bunu bir int'e assign
      // edersek NullPointerException verecegi icin Optional yaptik