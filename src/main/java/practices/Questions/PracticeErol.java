package practices.Questions;

import java.util.Random;
import java.util.Scanner;

public class PracticeErol {
    public static void main(String[] args) {

        /*
            Kullanicidan bir double sayi aliniz.
            1) Sayi eger 0 ise "Zero"
            2) Sayi pozitif ise
                a) 1'den kucuk ise "Positive small number"
                b) 1.000.000'dan buyuk ise "Positive large number"
            3)Sayi negatif ise
                a) 1'den kucuk ise "Negative small number"
                b) 1.000.000'dan buyuk ise "negative large number"  (bkz resim)
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        double number = input.nextDouble();

        if (number > 0) {

            if (number < 1) {
                System.out.println("Positive small number");
            } else if (number > 1000000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }

        } else if (number < 0) {

            if (Math.abs(number) < 1) {
                System.out.println("Negative small number");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }

        } else {
            System.out.println("Zero");
        }





        /*
               1) random olarak 1 ile 100 arasinda bir sayi olusturun
               2) kullanicidan bu sayiyi bilmesini isteyin
               3) kullanici her deger girdiginde tuttugumuz sayi ile karsilastirip tahminini buyut/kucult diyelim
               4) kullanici tuttugumuz sayiyi bildiginde eger tahmin sayisi;
                    a) 3 veya daha az tahminde bildiyse "Vaowww"
                    b) 4-8 tahminde bildiyse "Aferin"
                    c) daha fazla tahminde bildiyse "basarisiz"
               yazdirin
            */

        //int tutulansayi = 65;
        Random rnd = new Random();
        int tutulansayi = rnd.nextInt(100);

        int tahmin = 0;
        int tahminsayisi = 0;  //counter

        while (tutulansayi!=tahmin){

            Scanner scan = new Scanner(System.in);
            System.out.print("Tahmininiz : ");
            tahmin= scan.nextInt();

            if (tahmin==tutulansayi){
                tahminsayisi+=1;
            } else if (tahmin<tutulansayi) {
                System.out.println("Buyut");
                tahminsayisi++;
            }else {
                System.out.println("Kucult");
                tahminsayisi++;
            }
        }

        if (tahminsayisi<=3){
            System.out.println("Vaooww");

        } else if (tahminsayisi>=4 && tahminsayisi<=8) {
            System.out.println("Aferin");
        }else {
            System.out.println("Basarisiz");
        }


                 /*
        ** Bir magaza satin alinan urunun toplam tutari 1000 tl den fazla ise %10 indirim uygulayacak.
        1) Kullanicidan kac adet alacagini sorun
        2) 1 adet 100tl
        3) Kullaniciya sonuc olarak ne kadar odemesi gerektigini bildir
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter quantity");//miktar
        int x = s.nextInt();

        //bir urun==100



        if ((x*100)>1000){
            System.out.println("Indirim tutariniz " + (0.1*x*100) + " ve odemeniz gereken tutar : " +
                    (x*100*0.9));
        }else {
            System.out.println("Indirim hakkiniz yok ve odemeniz gereken tutar : " + (x*100));
        }



                  /*
            Kullanicidan aldiginiz satir sayisi kadar bir dik ucgen resmi olustuurnuz.
            Bkz. ornek resim
             */


        Scanner input1 = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int n = input1.nextInt();


        for (int i = 1; i<=n; i++){

            for (int j = 1; j<=i; j++ ){
                System.out.print(j + " ");



            }
            System.out.println("");
        }


    }
}
