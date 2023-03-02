package suleymanhoca.day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*
            Kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz...");
        byte dayNo = input.nextByte();

        //1. yol : if ile
        if(dayNo==1){
            System.out.println("Pazar");
        }else if(dayNo==2){
            System.out.println("Pazartesi");
        }else if(dayNo==3){
            System.out.println("Sali");
        }else if(dayNo==4){
            System.out.println("Carsamba");
        }else if(dayNo==5){
            System.out.println("Persembe");
        }else if(dayNo==6){
            System.out.println("Cuma");
        }else if(dayNo==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gecerli gun sayisi giriniz");
        }

        //2. yol: switch ile
        switch(dayNo){
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("Carsamba");
                break;
            case 5:
                System.out.println("Persembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli gun sayisi giriniz");
        }





    }
}
