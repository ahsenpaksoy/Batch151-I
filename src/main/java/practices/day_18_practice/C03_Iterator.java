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

        while (itr.hasNext()){
            Object sayi = itr.next();

            if((Integer) sayi>5){
                System.out.print(sayi + " ");
            }
        }


    }
}
