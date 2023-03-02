package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {

    /*
       Kullanicidan bir sayi aliniz, o sayi "Pozitif" ise ekrana pozitif yazdirin, degilse ekrana "Pozitif degil" yazdirin
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number...");
        int number = input.nextInt();

        if(number>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif degil");
        }


       String result =  number>0 ? "Pozitif" : "Pozitif degil";
        System.out.println(result);

    }
}
