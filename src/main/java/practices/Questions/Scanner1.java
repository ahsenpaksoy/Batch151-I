package practices.Questions;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {


        // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi, Ikinci Adinizi ve Soyadinizi Aralarinda Bosluk Olacak Sekilde Giriniz");
        String str = scan.nextLine().toUpperCase().trim();

        char adIlkKarakter = str.charAt(0);
        char ikinciAdIlkKarakteri = str.charAt(str.indexOf(" ") +1);
        char soyadIlkKarakter = str.charAt(str.lastIndexOf(" ") + 1);

        System.out.println("" + adIlkKarakter + ikinciAdIlkKarakteri + soyadIlkKarakter);


        /*
        Kullanicidan ucgenin a, b ve c kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        Girilen uzunlukların, bir dik ucgenin kenar uzunlukları olup olmadıgını konsola yazdırınız
        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz:  4
        üçüncü kenarı giriniz:  5
        Bu bir dik üçgendir
     */
        System.out.println("Ucgenin a kenarini giriniz");
        int a = scan.nextInt();
        System.out.println("Ucgenin b kenarini giriniz");
        int b = scan.nextInt();
        System.out.println("Ucgenin c kenarini giriniz");
        int c = scan.nextInt();

        if(a*a + b*b == c*c){
            System.out.println("Bu bir dik ucgendir");
        }else if(a*a + c*c == b*b){
            System.out.println("Bu bir dik ucgendir");
        }else if(b*b + c*c == a*a){
            System.out.println("Bu bir dik ucgendir");
        }else{
            System.out.println("Bu bir dik ucgen degildir");
        }









    }
}
