package practices.SsgIfElseNestedIf;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {

            // Soru 2) Kullanicidan 100 uzerinden notunu isteyin.
            // Not’u harf sistemine cevirip yazdirin.
            // 50’den kucukse “D”,
            // =50  <60 arasi “C”,
            // =60  <80 arasi “B”,
            // =80’nin uzerinde ise “A”

        Scanner input = new Scanner(System.in);
        System.out.println("Not sistemine hosgeldiniz");
        System.out.println("Lutfen bir not giriniz");
        double not = input.nextDouble();

        if(not<0 || not>100){
            System.out.println("Gecersiz bir not girdiniz");
        }else if(not<50){
            System.out.println("Notunuz D");
        }else if(not<60){
            System.out.println("Notunuz C");
        }else if(not<80){
            System.out.println("Notunuz B");
        }else{
            System.out.println("Notunuz A");
        }

        System.out.println("bizi tercih ettiginiz icin tesekkurler");





    }
}
