package practices.day_18_practice;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class C03_Iterator {
    public static void main(String[] args) {

        /*
    Bir Deque olusturunuz icerisine int elemanlar ekleyiniz.
    5'den buyuk elemanları iterator ile yazdırınız

     */
        Deque<Integer> dq = new LinkedList<>(Arrays.asList(1,8,3,6,7)); //Deque interface oldugu icin override edilmis
                                                                        // halini aliyoruz LinkedList<>(); olarak
        System.out.println(dq);

        Iterator itr = dq.iterator();

        while (itr.hasNext()){ // yanında eleman var mı kontrol ediyorum
            Object sayi = itr.next(); //itr'ı bir adım ileriye atıyorum
                                      // uzerinden gectigi elemanı bize donduruyor
            if((Integer) sayi>5){
                System.out.print(sayi + " ");
            }
        }


    }
}
