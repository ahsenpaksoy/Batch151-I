package suleymanhoca.day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        /*
            Type a code, get age from user and decide which stage on it
            0 - 4 => baby
            5 - 12 => child
            13 - 20 => teenager
            21 = 30 => adult
            else (not expected age)
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        int age = input.nextInt();

        if(age<0){
            System.out.println("Gecerli yas giriniz...");
        }else if(age<5){
            System.out.println("Baby");
        }else if(age<13){
            System.out.println("Child");
        }else if(age<21){
            System.out.println("Teenager");
        }else if(age<31){
            System.out.println("Adult");
        }else{
            System.out.println("Not expected age");
        }


        // Baundary Value Analyze Test : Sinir Deger Analiz

        // Test yaparken kesinlikle kritik degerler kullanilmalidir.


    }
}
