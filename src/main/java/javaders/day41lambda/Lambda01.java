package javaders.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));
        System.out.println(getTheSumOfSquareOfOdds2(nums));
        System.out.println(getTheSumOfSquareOfOdds3(nums));

        System.out.println(getMultiplicationOfSquareOfEvens(nums));
        System.out.println(getTheSumOfEvenMaxAndOddMin(nums)); //15
        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(nums));//6+9=15


    }

    //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums){
        System.out.println("1) ");
        return nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                reduce(0, (t,u)->t+u);
    }
    //Note: reduce() methodundaki toplama isleminde "t" ilk parametrenin ilk degerini daha sonraki
    // tum degerleri toplamdan alir, "u" ise stream'den alir
    //reduce() => deger sayisini azaltmak. Coklu datayi tekli dataya cevirmek istedigimizde bu method kullanilir

    public static int getTheSumOfSquareOfOdds2(List<Integer> nums){
        System.out.println("1) ");
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare). //Ihtiyaciniz olan method java class'larinda yoksa Utils Class olusturup icinde
                                       // Ihtiyaciniz olan method'u olusturunuz ve method reference kullaniniz.
                                       // kendi class'imdaki method'u kullandim
                reduce(0, Math::addExact); //Class ismi :: Method Ismi ==> Method Reference
    }

    public static int getTheSumOfSquareOfOdds3(List<Integer> nums){
        System.out.println("1) ");
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).
                reduce(Math::addExact).
                get(); //get() method'u Optional<Integer> i Integer'a cevirir.
        //reduce method'unu etkisiz eleman olmadan kullanirsak data tipi hatasi verir'
    }



    //Example 2: Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini
    // hesaplayan method olusturunuz.
    public static int getMultiplicationOfSquareOfEvens(List<Integer> nums){
        System.out.println("2) ");
        return nums.
                stream().
                filter(t->t%2==0).
                map(t->t*t).
                distinct().
                reduce(1, (t,u)->t*u); //147456
    }
    //Soruda, kareleri tekrarsız olmalı deniyor. Bu nedenle distinc methodu, kareleri hesapladiktan sonra (map'ten sonra) yazildi.

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinin
    // toplamini  hesaplayan method olusturunuz.
    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums){
        System.out.println("3) ");
        int maxEven = nums.stream().distinct().filter(t->t%2==0).reduce((t,u)->t>u ? t : u).get();
        int minOdd = nums.stream().distinct().filter(t->t%2!=0).reduce((t,u)->t<u ? t : u).get();
        return maxEven + minOdd;
    }
    //kodu gelistirmek icin distinct kullandik
    //reduce() methodunu etkisiz eleman kullanmadan kullanirsak data tipleri uyusmadigi icin hata verir(Optional Integer verir).
    // Burada reduce() methodundan sonra get() methodunu kullanmamiz gerekir
    //reduce methodunu, etkisiz eleman kullanmadan kullanirsaniz. get() kullanın ki optional Int i normal int e cevirmis olalım.


    //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7 den kucuk maximum degeri ile tek sayi olan elemanlarin
    //8 den buyuk minimum degerinin toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums){
        System.out.println("4) ");
        int max = nums.stream().distinct().filter(t->t%2==0 && t<7).reduce((t,u)->t>u ? t : u).get();
        int min = nums.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t,u)->t<u ? t : u).get();
        return max + min;
    }






}
