package practices.day_06_practice;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {

        /*
         Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

         işlem 1: Bakiye Sorgulama
         işlem 2: Para Cekme
         işlem 3: Para Yatırma
         işlem 4: İşlemi Sonlandırın

         Ve bu islemleri Switch case kullanarak yaptırınız.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("1-4 arasi islem numarasi giriniz" + "\n" +
                "Islem 1: Bakiye Sorgulama" + "\n" +
                "Islem 2: Para Cekme" + "\n" +
                "Islem 3: Para Yatirma" + "\n" +
                "Islem 4: Islemi Sonlandir");
        int islemNo = scan.nextInt();
        int bakiye = 1000;

        switch (islemNo){
            case 1:
                System.out.println("Bakiyeniz: " + bakiye + "TL");
                break;

            case 2:
                System.out.println("Cekmek istediginiz parayi giriniz");
                int cekilecekPara = scan.nextInt();

                if(cekilecekPara<=bakiye){
                    bakiye -= cekilecekPara;
                    System.out.println("Para cekme isleminden sonraki mevcut bakiyeniz: " + bakiye + "TL");
                }else{
                    System.out.println("Bakiyeniz yetersiz");
                }
                break;

            case 3:
                System.out.println("Yatirmak istediginiz parayi giriniz");
                int yatirilacakPara = scan.nextInt();

                if(yatirilacakPara<=2000){
                    bakiye += yatirilacakPara;
                    System.out.println("Para yatirma isleminden sonraki mevcut bakiyeniz: " + bakiye + "TL");
                }else{
                    System.out.println("ATM'de gunluk para yatirma limiti 2000 TL'dir.");
                }
                break;

            case 4:
                System.out.println("Techpro Bank'i kullandiginiz icin tesekkur ederiz");
                System.out.println("Lutfen kartinizi almayi unutmayiniz!");
                break;

            default:
                System.out.println("Gecerli bir numara giriniz");
        }

    }
}






