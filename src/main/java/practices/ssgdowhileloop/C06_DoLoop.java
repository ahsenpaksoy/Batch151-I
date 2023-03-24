package practices.ssgdowhileloop;

import java.util.Random;
import java.util.Scanner;

public class C06_DoLoop {
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
        int counter=0;
        int kullaniciSayi=0;
        do {
            System.out.println("lutfen tahminde bulunmak icin 1 ile 100 arasinda tamsayi giriniz");
            kullaniciSayi= scan.nextInt();
            if (kullaniciSayi<sayi){
                System.out.println("lutfen daha buyuk bir sayi giriniz");
            } else if (kullaniciSayi>sayi) {
                System.out.println("lutfen daha kucuk bir sayi giriniz");
            }
            counter++;
        }while (sayi!=kullaniciSayi);
        System.out.println("tuttugunuz sayiyi : "+counter+". tahminde buldunuz");

    }
}
