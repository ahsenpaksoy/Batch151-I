package practices.day_08_practice;

import java.util.ArrayList;
import java.util.List;

public class C04_List {
    public static void main(String[] args) {

         /*
          İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)

          String[] arr = {"John","Brad","Angel","Sofia","Emily"};
          String[] brr = {"sofia","brad","grace","emily","hazel"};

          Output : [Brad,Sofia,Emily]

         */

        String[] arr = {"John","Brad","Angel","Sofia","Emily"};
        String[] brr = {"sofia","brad","grace","emily","hazel"};

        List<String> list = new ArrayList<>();

        for(String each1 : arr){
            for(String each2 : brr){
                if(each1.equalsIgnoreCase(each2)){
                    list.add(each1);
                }
            }
        }
        System.out.println("ortak olan elemanlar : " + list);





    }
}
