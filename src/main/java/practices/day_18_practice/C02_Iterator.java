package practices.day_18_practice;

import java.util.*;

public class C02_Iterator {

     /*
       Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
       set'deki cift elemanları iterator ile siliniz
     */
     public static void main(String[] args) {

         Set<Integer> st = new TreeSet<>(Arrays.asList(1,2,3,4,5));
         System.out.println(st);

         Iterator itr = st.iterator(); // set'lerde index yapisi yoktur. Bu sebeple iterator kullanilir
                                       // List haric hicbir collections uyesinde index yapisi yoktur.
         while(itr.hasNext()){ //yaninda eleman var mi kontrolet. Varsa true yoksa false dondurecek.
                               // true oldugu muddetce while dongusu devam edecek
             Object sayi = itr.next();
             if((Integer) sayi%2==0){
                 itr.remove();
             }
             //System.out.println(st);
         }
         System.out.println(st);
     }
}

//list'in disindaki collection uyelerinde index yoktur.Iterator index yapisi olmayan collectionlarda kullanilir.
