package practices.Questions;

import java.util.Arrays;
import java.util.Random;

public class ArrayReverseShuffle {

    //Verilen bir Array'in elemanlarının büyükten küçüğe sıralayan kodu yazınız.
    //Verilen bir Array'in elemanlarını karıştıran kodu yazınız.

    public static void main(String[] args) {
        int[] arr = { 21,564,6,8,232,5656,65};

        sortByDescendingOrder(arr);
        System.out.println(Arrays.toString(arr));

        shuffleOrder(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void sortByDescendingOrder(int... args){
        Arrays.sort(args);
        System.out.println();

        for (int i = 0; i <args.length/2; i++) {

            int temp = args[i];
            args[i] = args[args.length-1-i];
            args[args.length-1-i] = temp;

        }
    }

    public static void shuffleOrder(int... args) {
        //Rastgele sayı üretebilmek için Random sınıfının bir nesnesini oluşturuyoruz.
        Random random = new Random();

        for (int i = 0; i < args.length; i++) {
            //Döngünün her turunda random bir index oluşturuyoruz.
            int randomIndex = random.nextInt(args.length);

            int temp = args[i];
            args[i] = args[randomIndex];
            args[randomIndex] = temp;
        }
    }
}
