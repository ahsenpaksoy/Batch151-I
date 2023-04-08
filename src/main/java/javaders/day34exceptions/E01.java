package javaders.day34exceptions;

public class E01 {

     /*
        1)"Exception" beklenmedik problem demektir.
        2)"Exception" i halledebilmek icin iki temel yol vardir;
            i)"Exception" a uygun cozumler uretebilirsiniz. Buna "Exception Handling" denir.
            ii)"Exception" olustugunda bunu ilan eder ve geri cekilirisniz. Buna da "Throw Exception" denir.
        3)"Exception" a uygun cozumler uretmede "try-catch" kullanilir.
          "try block" da yapilmasi gereken islemi Java'dan yapmasi istenir.
          Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
          "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki kodlar calisir.
        4)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz
     */

    public static void main(String[] args) {

        System.out.println(divide1(12,3));
        System.out.println(divide1(6,0));

        System.out.println(divide2(12,3));
        System.out.println(divide2(6,0));

    }

    //1.Way: Exception'i handle etmede ilk ve igrenc yol tavsiye edilmez
    public static int divide1(int a, int b){
        if(b==0){
            return 0;
        }else{
            return a/b;
        }
    }

    //2.Way: Exception'i handle etmede harika yol
    public static int divide2(int a, int b){
        int result = 0;

        try{
            result = a/b;
            System.out.println("I am here");
        }catch(ArithmeticException e){//"ArithmeticException" matematik ile ilgili herhangi bir kural ihlali yapildiginda atilir.
            System.out.println("There is an issue in division");
        }
        return result;
    }

}
   //ArithmeticException'i matematik kurallarina aykiri is yapildiginda verir java.
   //Java ArithmeticException alinca direk catch'e gider. exception alindiktan sonra
   //try'in icindeki hicbir code calismaz.
   //exception hata verir hata verdikten sonra hicbir code calismaz

   /* " Exception" beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda Exception class'i devereye girer
         Exception class'İ bize karsilasilan sorunun cinsini, bu sorunun nereden kaynaklandigini ve sebebini verir.
      *  Java exception firlattiginda kodun calismasini durdurur. java exception olusturan kod icin bizden bir karar vermemizi ister
      *  Eger hicbirsey yapmaz isek beklendigi gibi kodumuzun calismasini durdurur.
      *    - Kodumuzun calismaya devam etmesini istiyorsak try catch ile exception olusturmasi muhtemel kodlarimizi catch blogu icinde yazmaliyiz
      ** Exception i halledebilmek icin iki temel yol vardir;
         1) Exception a uygun cozumler uretebilirsiniz. Buna Exception Handling denir
         2) Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Bunada "Throw Exception" denir
      * Exception a uygun cozumler uretmede "try-catch" kullanilir, try block icinde yapilmasi gereken islemi java dan isteriz
        Eger java bu islemi sorunsuz bir sekilde yaparsa catch block devreye girmez
        try block icerisinde eger bir "exception" olusursa catch block o zaman devreye girer, ve catch black icindeki kodlar calisir
     *  try block icinde islem yapilirken "Exception" olusursa try block icindeki exceptiondan sonraki kodlar calistirilmaz
     *  catch satirindaki parantez icine karsilasilmasi muhtemel olan exception class ismini ve bir obje ismi (e) yazariz
     *  if else kullanirsak olusabilecek her problemi specific olarak if parantezinin icine yazmamiz gerekir. Bu da ciddi bir matematik bilgisi gerektirir
        ve yazacagimiz kodu cok uzatir.
        Ama try catch te java ilgili Exception ile alakali olusabilecek tum problemleri yakalar
    */
