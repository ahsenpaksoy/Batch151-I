package practices.Questions;

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
        System.out.println("Ilk tamsayiyi giriniz");
        int num1 = input.nextInt();

        System.out.println("Ikinci tamsayiyi giriniz");
        int num2 = input.nextInt();

       Object result1 =  num1==num2 ? ("Sayılar Birbirine Esit") : (num1>num2 ? ("Buyuk sayi: " + num1) : ("Buyuk sayi: " + num2));
        System.out.println("result1 = " + result1);


        /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */
        System.out.println("Bir karakter giriniz");
        char ch = input.next().charAt(0);

       Object result3 = (ch>='A' && ch <='Z') || (ch>='a' && ch <='z') ? (ch>='A' && ch <='Z' ? "Buyuk Harf" : "Kucuk Harf") : ("Harf Degil");
        System.out.println("result3 = " + result3);


        /*
        Kullanıcıdan 100 üzerinden notunu sisteme girmesini isteyiniz.
        Girilen not;
        not>100 ise konsola "100 den buyuk not giremezsiniz" yazdırın
        not>89 ise konsola "A" yazdırın
        not>79 ise konsola "B" yazdırın
        not>69 ise konsola "C" yazdırın
        not>59 ise konsola "D" yazdırın
        not>49 ise konsola "E" yazdırın
        not>-1 ise konsola "F" yazdırın
        degilse " negatif not giremezsiniz" yazdırın
         */
        System.out.println("Notunuzu giriniz");
        int not = input.nextInt();

        String harf = not>100 ? "100'den buyuk not giremezsiniz" : not>89 ?
                                                                    "A" : not>79 ?
                                                                    "B" : not>69 ?
                                                                    "C" : not>59 ?
                                                                    "D" : not>49 ?
                                                                    "E" : not>-1 ?
                                                                    "F" : "Negatif Not Giremezsiniz";
        System.out.println(harf);


    }
}
