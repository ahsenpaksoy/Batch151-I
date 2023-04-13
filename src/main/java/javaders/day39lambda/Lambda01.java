package javaders.day39lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        List<String> iller = new ArrayList<>(Arrays.asList("Eskisehir","MUS","VAN","Edirne","Ordu","VAN","Izmir","Safranbolu","Izmir"));

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);
        System.out.println();


        ilkHarfBykDigerKucukYazdir(iller);
        System.out.println();

        System.out.println(ilkHarfEveyaSOlanlariYazdir(iller));
        System.out.println();



    }

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1. Way:
    public static void printElements(List<String> myList){
        for(String w : myList){
            System.out.print(w + " "); //Bu Structured Programming
        }
    }


    //2. Way:
    public static void printEl(List<String> myList) {
        myList.stream().forEach(t-> System.out.print(t + " "));
    }
    // Lambda Functional Programming'dir
    //stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir.
    //list'i stream'e cevirdik icinde tom jim clara var.
    //stream yapiyi degistiriyor tom en ustte onun altinda jim onun altinda clara var. Yukaridan
    //asagiya dogru yaziyor.
    //t, w gibi elemanlari alacak.



// Functional Programing ==>sadece metodlarin kullanildigi mimarinin onemsiz oldugu kod.
// Lambda functional programing'dir.

    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElExceptStartsWithT(List<String> myList){
        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t + " "));

        //filter() verilen kurala gore eleman secer.
    }

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElLengthLessThanFour(List<String> myList){
        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t + " "));
    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourWithUpper(List<String> myList){
        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t + " "));
    }
    //map() var olan elemani degistirmek icin kullanilir.

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()>4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t + " "));
    }
    //distinct()tekrarli elemanleri bir kere gosterir.
    //Lambdada elemanlari azaltanlar once kullanilir.


    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    public static void printElUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t + " "));
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge
    // siralayarak console'a yazdiran method'u olusturunuz.
    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t + " "));
        //Note: Siralamayi bir sarta baglayacaksak sorted(Comparator.comparing()) kullanmaliyiz
    }

    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz

    public static List<String> ilkHarfBykDigerKucukYazdir(List<String >iller) {
        System.out.print("8) ");
        iller.
                stream().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                forEach(t-> System.out.print(t+" "));
        return iller;
    }
    // Example 9: Ilk Harfi "E" veya "S" olanlari bir liste icerisinde yazdiran methodu olusturunuz

    public static List<String> ilkHarfEveyaSOlanlariYazdir(List<String >iller) {
        System.out.print("9) ");
        return     iller.
                stream().
                filter(t->t.startsWith("E") || t.startsWith("S")).
                collect(Collectors.toList());// bir akisin sonuclarini bir listin icinde toparlamak icin kullanilir
    }

}

/*
    1)Lambda; method create etme degil mevcut method'lari library'den cagirip kullanmaktir
    2)Java 8 ile eklenmistir
    3)Functional Programming dir. Mimari yapiya onem vermez
    4)Hiz , Clean Code ve okunabilirlik acisindan onemlidir
*/
//Lambda collection ve listlerde kullanilabilir fakat map'lerde kullanilamaz
//sorted() methodu natural order olarak calisir.String datalar icin A'dan Z'ye integer datalar icin 1-999 seklinde siralama yapar











