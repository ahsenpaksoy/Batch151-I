package practices.day_02_practice;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        /*

             Bir restoranda, müşteriler menüden yemeklerini seçerler.
             Restoran, müşterilerin seçtiği yemeği pişirmek için bir
             program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
             secerse  o menunun musteriye hazirlani

             hamburger == 200TL
             pizza == 500TL
             tavuk == 700TL

         */
        String yemek = "Hamburger";

        switch (yemek.toLowerCase()){
            case "hamburger":
                System.out.println("Hamburger menusu 200 TL");
                break;
            case "pizza":
                System.out.println("Pizza menusu 500TL");
                break;
            case "tavuk":
                System.out.println("Tavuk menusu 700 TL");
                break;
            default:
                System.out.println("Oyle bir secenek yok");

        }

         /*
             Bir arac kiralama sitesinde secilen araba markasina gore degisen kiralama ucreti ve kiralanacak gun sayisina gore
             Toplam odenecek fiyati gosteren kodu yaziniz
             SUV ==>500.0
             SEDAN ==> 400.0
             HATCBACK ==> 350.0
             geriye kalanlar ==>300.0 TL
             double toplamUcret = kiralamaUcreti + kiralanacakGunSayisi;

          */
        String aracTuru = "SUV";
        int kiralanacakGunSayisi = 5;
        double kiralamaUcreti;

        switch (aracTuru){
            case "SUV":
                kiralamaUcreti = 500.0;
                break;
            case "SEDAN":
                kiralamaUcreti = 400.0;
                break;
            case "HATCBACK":
                kiralamaUcreti = 350.0;
                break;
            default:
                kiralamaUcreti = 300.0;
                break;
        }
        double toplamUcret = kiralamaUcreti * kiralanacakGunSayisi;
        System.out.println("toplamUcret = " + toplamUcret);


        /*
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Lütfen araç markasını seçin:");
        System.out.println("1 - Mercedes");
        System.out.println("2 - BMW");
        System.out.println("3 - Audi");

        int choice1 = scanner2.nextInt();
        double rentalPrice = 0.0;

        switch (choice1) {
            case 1:
                rentalPrice = 200.0;
                break;
            case 2:
                rentalPrice = 180.0;
                break;
            case 3:
                rentalPrice = 150.0;
                break;
            default:
                System.out.println("Geçersiz seçim yaptınız.");
                System.exit(0);
        }

        System.out.println("Lütfen kaç gün kiralayacağınızı girin:");
        int days = scanner2.nextInt();

        double totalPrice = rentalPrice * days;
        System.out.println("Toplam ödenecek tutar: " + totalPrice + " TL");

   */

        /*
            Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
            Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
            gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
            istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
            onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
            kontrol eden bir program yaziniz

            elephant lion giraffe
            default ==> belirtilen hayvan bulunamadi
   */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen beslemek istediğiniz hayvanın ismini yazın:");
        String animal = scanner.nextLine();

        switch (animal) {
            case "fil":
                System.out.println("Robot filin yanına gitti ve yemek verdi.");
                break;
            case "aslan":
                System.out.println("Robot aslanın yanına gitti ve yemek verdi.");
                break;
            case "zebra":
                System.out.println("Robot zebranın yanına gitti ve yemek verdi.");
                break;
            default:
                System.out.println("Maalesef beslemek istediğiniz hayvan mevcut değil.");
        }









    }
}
