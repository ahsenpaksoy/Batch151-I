package practices;

import java.util.Scanner;

public class Ternary1 {
    public static void main(String[] args) {

                /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int number = input.nextInt();

        Object result = number%2==0 ? ("Cift sayi") : number+3;
        System.out.println(result);


         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */















    }
}
