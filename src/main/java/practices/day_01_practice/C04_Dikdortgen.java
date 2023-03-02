package practices.day_01_practice;

import java.util.Scanner;

public class C04_Dikdortgen {
    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin a kenarini giriniz...");
        int a = input.nextInt();

        System.out.println("Dikdortgenin bkenarini giriniz...");
        int b = input.nextInt();

        int cevre = 2*(a+b);
        System.out.println("cevre = " + cevre);




    }
}
