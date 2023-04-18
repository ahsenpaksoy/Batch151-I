package javaders.day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        //names.add("Brad");

        System.out.println(sortWithLastCharDistinctUpperInList(names));
        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names));
        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(noLengthLessThanThree(names));
        System.out.println(atLeastOneLengthLessThanFour(names));

    }

    //Example 1: List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir list'in icinde return ediniz.
    //           Tom, Alex, Jim, Michael, Mary, Alexander, Alex ==> [MICHAEL, TOM, JIM, ALEXANDER, ALEX, MARY]
    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList()); //collect() method'uyla sonucu bir list'e veya bir set'e koyariz
        //Normalde distinct elemanlari depolamak icin "Set" kullanilir.Ama Lambda'daki collect(Collectors.toSet());
        //method'u elemanlari rastgele siralar halbuki bu soruda rastgele siralama kabul edilmiyor.
        //Bu yuzden mecburen collect(Collectors.toList()); kullandik.
    }

    //Exaple 2: List elemanlarini character sayilarina gore ters sirada kucuk harfle bir list'in icinde return ediniz.
    //          Ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun
    //          [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> Alexander,Michael,Alex,Alex, Mary,Jim,Tom]
    public static List<String> sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String> names){
        return names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());
        //siralamanin icinde siralama kullanmak icin thenComparing() kullanilir
    }

    //Example 3: List elemanlarinin tamaminin character sayisinin 2 den buyuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean isLengthMoreThanTwo(List<String> names){
        return names.stream().allMatch(t->t.length()>2);

        //Sorumuzda elemanlarin tamami dendiginden allMatch methodunu sectik. Herbir elaman alinacak ve karakter sayilarina
        //bakacak, 2'den buyukse true verecek aksi halde false verecek.

        //allMatch() methodu tum elemanlarda verilen sarta gore karsilastirma yapar.Tamami ortusuyorsa true degilse false verir
    }

    //Example 4: List elemanlarinin hicbirinin character sayisinin 3 den kucuk olmadigini kontrol eden method'u olusturunuz.
    public static boolean noLengthLessThanThree(List<String> names){
        return names.stream().noneMatch(t->t.length()<3);
    }

    //Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean atLeastOneLengthLessThanFour(List<String> names){
       return names.stream().anyMatch(t->t.length()<4);
    }

    /* Match
        allMatch() ==> tum elemanlar sarti saglarsa true dondurur
        anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
        noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
    */


}
