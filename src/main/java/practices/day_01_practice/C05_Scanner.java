package practices.day_01_practice;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz...");
        String ad = input.nextLine();

        System.out.println("Lutfen soyadinizi giriniz...");
        String soyad = input.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        int yas = input.nextInt();

        System.out.println("Lutfen boyunuzu giriniz...");
        int boy = input.nextInt();

        System.out.println("Lutfen kilonuzu giriniz...");
        int kilo = input.nextInt();

        System.out.println("Adi: " + ad + "\n" + "Soyad: " + soyad + "\n" + "Yas: " + yas +
                            "\n" + "Boy: " + boy + "\n" + "Kilo: " + kilo);






    }
}
