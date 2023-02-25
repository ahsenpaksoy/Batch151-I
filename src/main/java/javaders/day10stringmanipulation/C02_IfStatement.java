package javaders.day10stringmanipulation;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        //Kullanici gun numrasini girsin kod gun ismini yazsin
        // 1 ==> Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba
        // 5== Persembe  6 == Cuma  7 == Cumartesi
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz...");
        int dayNo = input.nextInt();

        if(dayNo == 1){
            System.out.println("Pazar");
        }else if(dayNo == 2){
            System.out.println("Pazartesi");
        }else if(dayNo == 3){
            System.out.println("Sali");
        }else if(dayNo == 4){
            System.out.println("Carsamba");
        }else if(dayNo == 5){
            System.out.println("Persembe");
        }else if(dayNo == 6){
            System.out.println("Cuma");
        }else if(dayNo == 7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gecerli bir gun numarasi giriniz...");
        }




    }
}
