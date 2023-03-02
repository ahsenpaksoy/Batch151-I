package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {

    /*
       Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz
     */

    /*
       1) Ternary de true ve false durumlari icin size verilen data tipleri farkli ise olusturdugunuz
       container in data tipini "Object" yapin
       2) "Object" Java da bir class'dir.
          "Object" Javada'ki butun class'larin "Parent"i dir.Yani babasidir, Hz Adem gibi.
          "Object" class'in "Parent"i yoktur.
          Java'da parent'i olmayan tek class "Object Class" dir.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer...");
        int num = input.nextInt();

        Object result = num%2==0 ? num/2 : "Bu sayi ikiye bolunmez";
        //Ternary de farkli data turleri aliyorsaniz data tipini  "Object" almalisiniz
        System.out.println(result);





    }
}
