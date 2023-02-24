package introduction.day01variables.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu alin
        //i)Alanini hesaplayin
        //ii)Cevresini hesaplayin

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz...");
        double shortSide = input.nextDouble();

        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz...");
        double longSide = input.nextDouble();

        double alan = shortSide*longSide;

        System.out.println("alan = " + alan);  //tavsiye edilen kullanim
        System.out.println("Dikdortgenin cevresi : " + (2*shortSide + 2*longSide));






    }
}
