package practices.Questions;

import java.util.Arrays;

public class ArrayQuestion {
    public static void main(String[] args) {

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        //1. Step : iki boyutlu array de oncelikle kac eleman oldugunu dynamic olarak bulalim

        int toplamElemanSayisi =0;
        //{ {5, 4}, {2, 3, 2} }
        for (  int [] w :    numbers ) {
            toplamElemanSayisi =   toplamElemanSayisi +  w.length;
        }
        System.out.println(toplamElemanSayisi);

        //2. Step : Tek boyutlu arrayi elde ettigimiz eleman sayisi kullanarak olusturalim
        int newArr [] = new int[toplamElemanSayisi];
        //3. Step : Iki boyutlu array deki elemanlari tek boyutlu arraye transfer edelim
        int idx =0;
        //{ {5, 4}, {2, 3, 2} }
        for ( int []  w: numbers  ) {
            for ( int k :   w  ) {
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));



        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

        int small = ages[0][0];     //{ {15, 4}, {12, 43, 21} }
        int big = ages[0][0];

        for ( int []  w :    ages    ) {

            for ( int k : w   ) {

                small = Math.min(small,k);
                big = Math.max(big,k);

            }
        }
        System.out.println(small+big);










    }
}
