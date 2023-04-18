package practices.day_18_practice;

import java.util.Scanner;

public class C01_IllegalArgumentException {
    /* Kullanıcıdan yasını sisteme girmesini isteyiniz.
        Kullanıcı yas olarak 0'dan kucuk esit veya
        120'den buyuk esit bir sayı girerse
        IllegalArgumentException olusacak sekilde
        bir program yazınız
         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        if(yas<=0 || yas>=120){
            throw new IllegalArgumentException();
            //Java bizim istedigimiz durumlarda exception firlatabilir.
        }else{
            System.out.println("Uygun bir yas girdiniz");
        }



    }

}
