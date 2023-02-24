package javaders.day02printmethodcreation;

import java.util.Scanner;

public class PrintlnPrint {

    // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
    // bir harf  bir alt satirda olacak sekilde yazdiriniz

    public static void main(String[] args) {

        /*
        \n ==> her bir karakteri bir alt satirda yazdirir.
        \t ==> 1 tab bosluk birakir
        \" ==> consolda " yazdirmayi saglar
         */

        //1. yol
        System.out.println("****************1. YOL++++++++++++++++++++++");
        System.out.println("T");  // ctrl + D   cogaltmak icin
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        //2. yol
        System.out.println("********************2. YOL******************************+");
        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt satirda olacak sekilde tek bir sout ile yazdiriniz

        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");


        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira
        // yazdiran kodu tek bir sout ile yazdiriniz

        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");

        //JAVA ILE GUZEL DUNYA ifadesinin her bir kelime arasinda 1 tab bosluk birakan kodu yazin.
        //JAVA I  00> ! space bosluk
        //JAVA   I 00> 1 tab bosluk
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");
        System.out.println("JAVAM\tILEM\tGUZEL\tDUNYA");  //  \t de harf sayisi onemlidir yoksa esit aralik birakmaz

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz
        System.out.println("\"Techpro \" ile java cok ' kolay '");


        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        //seklinde noktali virgulden sonra
        //3 satir alttan paragraf basi yaparak yazdiran kodu olusturun
        System.out.println("\" MAHARET\" hic " +
                "'DUSMEMEK' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

        //Print ile Println arasindaki farklar
        // ln ==> line next bir sonraki satira gec

        System.out.println("****************** 1 ***********************");
        System.out.print("Ali");
        System.out.println("Can");
        //AliCan yazdirir

        System.out.println("****************** 2 ***********************");
        System.out.println("Ali");
        System.out.print("Can");
        //Ali
        //Can  yazdirir

        System.out.println("****************** 3 ***********************");
        System.out.print("Ali");
        System.out.println("Can");

        //Can****************** 3 ***********************
        //AliCan

        // Soru4)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
        /*
          A
         A A
        A A A
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz");
        char ch = input.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);

        // aralarinda bir tab bosluk birakarak tek sout ile yazalim
        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t" +"\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);


    }

}
