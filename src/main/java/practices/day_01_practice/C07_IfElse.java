package practices.day_01_practice;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz...");
        int num1 = scan.nextInt();

        System.out.println("Ikinci sayiyi giriniz...");
        int num2 = scan.nextInt();

        if(num1>num2){
            System.out.println("Ilk sayi ikinci sayidan buyuktur");
        }else{
            System.out.println("Ilk sayi ikinci sayidan kucuktur");
        }


    }
}
