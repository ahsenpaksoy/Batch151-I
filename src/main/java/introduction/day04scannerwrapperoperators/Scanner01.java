package introduction.day01variables.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz...");
        int number = input.nextInt();

        //Bir sayinin son rakamini alabilmek icin 10 a bolup kalanini aliriz. % ==> modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalanini verir.
        //dolayisiyla %10 her zaman birler basamaginda bulunan sayiyi verir.
        //Bir tam sayiyi bir tamsayiya bolerseniz java sonucu kesinlikle bir tamsayi yapar, yuvarlama yapmaz ondalikli kismi iptal eder.
        //dolayisiyla bir tam sayiyi 10 a bolersek birler basamagini silmis oluruz

        //son rakami al
        int lastDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan ikinci rakami al
        int lastSecondDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan ucuncu rakami al
        int lastThirdDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan dorduncu rakami al
        int lastFourthDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan besinci rakami al
        int lastFifthDigit = number%10;
        //sayi kucult
        number = number/10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit);





    }
}
