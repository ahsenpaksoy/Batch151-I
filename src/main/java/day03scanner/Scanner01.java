package day03scanner;

import java.util.Scanner;
//javanin util library sinden scanner class import edildi demektir.

public class Scanner01 {
    public static void main(String[] args) {

        //scanner kullanicidan aldigi datalari sisteme alir
        /*
        1. adim) Scanner Class tan bir obje olustur.
        obje ismini input yaptik cunku bu  obje kullanicidan alinan datayi benim kodlarimin icine koyacak.
         */
        Scanner input = new Scanner(System.in);

        //2. adim) Kullaniciya ne istediginize dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz : ");

        //3. adim) Uygun methodu kullanarak kullanicinin verdigi datayi memory ye yerlestiriniz.
        byte age = input.nextByte();
        System.out.println(age);


    }
}
