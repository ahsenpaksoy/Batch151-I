package practices.lambda_recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Lambda02 {
    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt",
                "nar","mandalina","armut","elma","keciboynuzu","elma"));

        ilkHarfeVeyac(meyve);
        System.out.println(" \n  *******");
        elemanBasinaVeSonunaYildiz(meyve);
        System.out.println(" \n  *******");
        System.out.println(karakterSayGoreBuyKucSirKarSayEnBuyIlk3(meyve));
    }
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari yazdıralım
    public static void ilkHarfeVeyac(List<String> meyve){
        meyve.stream().filter(t->t.startsWith("e") || t.startsWith("c")).forEach(Utils::yazdir);
    }
    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void elemanBasinaVeSonunaYildiz(List<String> meyve){
        meyve.stream().map(t->"*" + t + "*").forEach(Utils::yazdir);
    }
    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static List<String> karakterSayGoreBuyKucSirKarSayEnBuyIlk3(List<String> meyve){
/*
       List<String> sonuc = meyve.
                            stream().
                            sorted(Comparator.comparing(t->t.toString().length()).reversed()).
                            limit(3).collect(Collectors.toList());
       return sonuc;
 */
        List<String> sonuc = meyve.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(3).collect(Collectors.toList());
        return sonuc;
    }

    /**
     Bu soruda biz ;
     1) List istedigi icin return type List<String> yaptik.
     2) stream() ile akisa aldik.
     3) sorted() ile siralama yaptik. Siralama yaparken karakter sayisini belirttik. Java kizardi cünkü
     eger gelen String degerlerin lenght'i 0 olursa diye korkar bizde toString() ile bunun garantisini verdik.
     sonra sorted bize natural order verir yani kucukten buyuge , bu sebeple reversed() ile buyukten kucuge
     dogru siralama yaptik.
     4) limit() methodu ile istedigimiz index'e kadar olan degerleri yani ilk 3 elemani aldik.
     5) en sonda  collect(Collectors.toList()); ile List olarak yazdirdik.

     */

}