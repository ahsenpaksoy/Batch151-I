package javaders.day36exceptions;

public class E03 {

     /*
            Soru: "throws" ile "throw" arasindaki farklar nelerdir?
            1)"throws" method signature satirinda kullanilir, "throw" ise method body icinde kullanilir.
            2)"throws" method signature satirinda bir veya birden fazla Exception ile bir kere kullanilir.
              "throw" ise method body icinde bir tane Exception ile tekrar tekrar kullanilabilir.
            3)"throws" dan sonra sadece Exception Class isimleri yazilir,
              "throw" dan sonra Exception Class'dan object olusturulur

           Mehmet Hoca'dan
              3) "throw" dan sonra "new" keyword ve constructor kullanilarak object olusuturulur
        *   "throws" dan sonra sadece Exception Class ismi yazilir
        4) "throw" belli sartlar icin Exception atmada kullanilir
            "throws" ise applicationu Exception attiktan sonra durdurur.

     */

    public static void main(String[] args) {

        printAge(23);

        try {
            printAge(-12);
        }catch(IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }

        printAge(-9);

    }
    //Example 1: Kullanicidan alinan yas'i console'a yazdiran method'u olusturunuz.
    public static void printAge(int age){

        if(age<0){
            throw new IllegalArgumentException("Used negative integers for ages");
        }
        System.out.println(age);
    }

}
   //Exception atmak demek application'i durdurmak demek.
   //Kendi olusturdugumuz method'larda exception atabiliriz.
