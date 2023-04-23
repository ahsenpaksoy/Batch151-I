package practices.day_18_practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {

        // Verilen bir array'den tekrar eden elemanları silip
        // unique elemanlardan olusan bir array haline donusturen method olusturun
        // int arr[]={1,2,2,3,4,4,5};

        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(Arrays.toString(benzersizYap(arr)));

    }
    public static int[] benzersizYap(int[] arr) {
        Set<Integer> tekrarsizSet = new TreeSet<>();

        for (int each : arr) {
            tekrarsizSet.add(each); // set, zaten unique olacagi icin tum elemanları direk ekledik
        }
        System.out.println(tekrarsizSet);

        int arr2[] = new int[tekrarsizSet.size()];

        int idx = 0;

        for(Integer each : tekrarsizSet){  // setlerde index yapısı olmadıgı icin foreach kullandık
            arr2[idx] = each;
            idx++;
        }
        System.out.println(Arrays.toString(arr2));

        arr = arr2;

        return arr;
    }
}