package practices.day_07_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {
    public static void main(String[] args) {

        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız
        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        Scanner scan = new Scanner(System.in);

        int arr[] = new int[4];

        for (int i = 0; i < 4; i++) {

            System.out.println("4 tane rakam giriniz");
            int rakam = scan.nextInt();

            arr[i] = rakam;
        }
        System.out.println(Arrays.toString(arr));

        int toplam = 0;
        for(int w : arr){
            toplam = toplam + w;
        }

        double ortalama = toplam / arr.length;
        System.out.println("ortalama = " + ortalama);

        for(int w : arr){

            if(w>ortalama){
                System.out.println(w + " ");
            }
        }


    }
}
