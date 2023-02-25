package javaders.day10stringmanipulation;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        // If it rains, I will cancel the picnic.
        // Eger yagmur yagarsa piknigi iptal edecegim.

        //Ex : Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu yaziniz.

        char ch = 'A';
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }

        //Ex : Verilen sayi cift sayi ise "Cift Sayi" yazdiran kodu yaziniz
        int num = 10;
        if(num%2==0){
            System.out.println("Cift Sayi");
        }else{
            System.out.println("Tek Sayi");
        }

        //Ex : Verilen bir sayi 300'den kucuk veya 1200'den buyukse "Harika Sayi" yazdiran kodu yaziniz
        int number = 3000;
        if(number<300 || number>1200){
            System.out.println("Harika Sayi");
        }

        //Ex : Kullanicidan alinan datanin tek mi cift mi oldugunu yazdiran kodu yaziniz
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int number1 = input.nextInt();
        if(number1 % 2 == 0){
            System.out.println("Cift Sayi");
        }
        if(number1 % 2 != 0){
            System.out.println("Tek Sayi");
        }

        //2. yol
        if(number1 % 2 == 0){
            System.out.println("Cift Sayi");
        }else{
            System.out.println("Tek Sayi");
        }

        //Ex : Verilen bir sayinin negatif mi, pozitif mi, notr mu oldugunu soyleyen kodu yaziniz
        int num1 = -45;
        if(num1 > 0){
            System.out.println("Pozitif Sayi");
        }else if(num1 == 0){
            System.out.println("Notr Sayi");
        }else{
            System.out.println("Negatif Sayi");
        }




    }
}
