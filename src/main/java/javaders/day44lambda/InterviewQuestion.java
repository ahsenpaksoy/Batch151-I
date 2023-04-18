package javaders.day44lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQuestion {
    public static void main(String[] args) {

        //Example 1: Size verilen bir array'in "Mountain Array" olup olmadigini gosteren kodu yaziniz.
        //           [0, 2, 5, 3, 1, -2]

        //Elemanlar bu cesit arrayde once artacak, belli bir elemana gelince o elemandan sonra azalacak.

        int[] arr = {0, 2, 5, 3, 1, -2};

        //Array'i list'e cevirelim cunku List'i kullanmak daha kolay.
        List<Integer> myList = new ArrayList<>();
        Arrays.stream(arr).forEach(t->myList.add(t));  // stream ile array'i stream'e cevirdik
        System.out.println(myList); // [0, 2, 5, 3, 1, -2]

        //List'teki max elemani bulalim
        int max = myList.stream().reduce(Math::max).get();
        System.out.println(max); // 5

        //List'teki max elemanin index'ini bullalim
        int idxOfMax = myList.indexOf(max);
        System.out.println(idxOfMax); // 2

        //Maximum elemana kadarki tum elemanlari bir List'in icine koy.
        List<Integer> firstList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)<=idxOfMax).forEach(t->firstList.add(t));
        System.out.println(firstList); //[0, 2, 5]

        //firstList'in copy'sini olustur
        List<Integer> firstListCopy = new ArrayList<>();
        firstList.stream().forEach(t->firstListCopy.add(t));
        System.out.println(firstListCopy); // [0, 2, 5]

        //Copy olan list'i sort et
        Collections.sort(firstListCopy);

        //firstList ile firstListCopy'nin ayni olup olmadigini kontrol et
        boolean rule1 = firstList.equals(firstListCopy);
        System.out.println(rule1);

        //Maximum elemandan sonraki tum elemanlari bir List'in icine koy.
        List<Integer> secondList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)>=idxOfMax).forEach(t->secondList.add(t));
        System.out.println(secondList);

        //secondList'in copy'sini olustur
        List<Integer> secondListCopy = new ArrayList<>();
        secondList.stream().forEach(t->secondListCopy.add(t));
        System.out.println(secondListCopy);

        //secondListCopy'yi ters olarak sirala
        Collections.sort(secondListCopy);
        Collections.reverse(secondListCopy);
        System.out.println(secondListCopy);

        //secondList ile secondListCopy ayni mi diye kontrol et
        boolean rule2 = secondList.equals(secondListCopy);
        System.out.println(rule2);

        System.out.println("Is the array mountain array? " + (rule1 && rule2));


    }
}
