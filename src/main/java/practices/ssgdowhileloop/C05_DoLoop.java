package practices.ssgdowhileloop;

import java.util.Random;
import java.util.Scanner;

public class C05_DoLoop {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur


        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int kullaniciSayi=0;
        int counter=3;
        int tahmin=0;
        System.out.println(sayi);

        do {
            tahmin++;
            System.out.println("lutfen 1-100 arasinda bir tamsayi giriniz");
            kullaniciSayi= scan.nextInt();
            if (kullaniciSayi>100||kullaniciSayi<0){
                System.out.println("lutfen gecerli bir deger giriniz");
                break;
            }
            else if (kullaniciSayi<sayi){
                System.out.println("lutfen sayiyi buyultun");
            } else if (kullaniciSayi>sayi) {
                System.out.println("lutfen sayiyi kucultun");
            }else if (kullaniciSayi==sayi){
                break;
            }

            counter--;
            System.out.println("kalan can hakkiniz : "+counter);
        }while (counter>0);
        if (sayi==kullaniciSayi) {
            System.out.println("bilgisayarin tuttu sayiyi buldunuz tahmin sayisi : "+tahmin);
        }else System.out.println("bilgisayarin tuttugu sayi buydu ama bulamadiniz : "+sayi);



    }
}
