package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {

    /*
        1)Iterator'lar loop'larin yaptigi ayni isi yapar.
        2)Iteratorlar'da sonsuz loop olusma ihtimali yoktur.
        3)Iterator'lar ile loop'lar arasinda performans farki yoktur.
        4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme
          konusunda daha bbasarilidir.
        5)Iki tip iterator var ; i)Iterator: Bu sadece elemen silmede kullanilir, eleman eklemek veya
           elemani degistirmek mumkun degildir.
                                ii)ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.
                                Note: "Iterator" sadece soldan saga(ilk elemandan son elemana) calisir
                                      "ListIterator" ise iki yonlu calisabilir.
     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); //[Tom, Jim, Clara, Angie, Mark]

        //Iterator kullanalim
        Iterator<String> myItr = myList.iterator(); //list'i iterator'a cevirdik.

        //iterator'un en basinda bir pointer vardir.Ilk elemanin oncesine pointer'i koyar.
        //hasNext() pointer'a senden sonra eleman var mi diye sorar,
        //varsa true olur sonraki kod calisir.Yoksa false olur loop kirilir
        while (myItr.hasNext()){
            myItr.next(); //next() pointer'i alir bi sonraki elemanin onune koyar.bir sonraki elemani almak icin kullanilir
            myItr.remove();
        }
        System.out.println(myList); //[ ]

        //hasNext() pointer'a senden sonra eleman var mi diye sorar.
        //Eleman varsa true yoksa false return eder.
        //next() pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
        //remove() next() method'unun return ettigi elemani siler.

        //ListIterator olusturulunca pointer otomatik olarak en basa konur.
        //iterator'daki elemman silinince list'te de otomatik olarak silinir.

        //listIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList); //[Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){

            String el = yourListItr.next();
            yourListItr.set(el + "!"); //set() method'u list'i update etmeye yarar.

            //hasNext() ve next() pointer'i en sona iter.

        }
        System.out.println(yourList); //[Tom!, Jim!, Clara!, Angie!, Mark!]

        //hasPrevious() ve previous() nasil kullanilir?
        while(yourListItr.hasPrevious()){ //hasPrevious() pointer'a senden once elemman var mi diye sorar.
            String el = yourListItr.previous(); //previous() method'u pointer'i bir one atar, ustunden atladigi elemani verir
            System.out.println(el);
            yourListItr.set("?" + el);
        }
        System.out.println(yourList); //[?Tom!, ?Jim!, ?Clara!, ?Angie!, ?Mark!]

        //hasPrevious() ve previous() kullanmak icin pointer en sonda olmalidir, yoksa kullanamazsiniz.
        //hasPrevious() sondan baslar

        //En sondan en basa nasil iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();   //sondan basa demek
        while(ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.println(el);
        }

        //descendingIterator() ancak LinkedList ile kullanilir.
        //descendingIterator() otomatik olarak pointer'i en sona koyar ve islem sondan baslar.



    }
}
