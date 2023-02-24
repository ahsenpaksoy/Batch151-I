package introduction.day01variables;

public class Variables01 {
    public static void main(String[] args) {
        //java bu satiri okumaz. Kendimize veya baskasina aciklamadir.
        /*
        java bu satirlari da okumaz.Birden fazla yorum satiri yazmak icin kullanilir.
         */

        //Variable olusturma
        //data type + variable name + atama operatoru + data + noktali virgul
        int age = 13;

        //java cumlesi ==> Statement
        //Data type + Variable Name ==> Variable Declaration
        //Assigment operator + Variable Degeri ==> Assigment
        //Eger variable Declaration yapar, assigment yapmazsaniz Java kendi degerlerini(default==>varsayilan) koyar
        //Default degerler sayilar icin sifirdir.
        //Dilbilgisindeki nokta ne ise javadaki noktali virgul ayni seydir ve statementin bittigini gosterir
        //javada esittir demek "==".

        /*
        Java da temelde iki tip data vardir.
        1)primitive data type:
          char, boolean, byte, short, int, long, float, double
        2)non-primitive data type:
          String
         */

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Stringlere verilen degerler daima cift tirnak icinde olmalidir
        String studentName = " Ali Can";
        //String bir variable olusturup ona herhangi bir atama yapmazsak java o variable a
        //default olarak "null" koyar
        //null demek 0 demek degil, 0 da coding te bir degerdir
        //null ici bos obje demek.icinde method veya variable bulunmayan default objedir
        //{}

        //char data type: Tek karakterler icin kullanilir.
        //ornegin ==> A, x, ?, 5
        //ornek 1 : char data type nda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        //Note : char data type nda degerler tek tirnak icine konmalidir.
        char firstLetter = 'A';

        //boolean data type : booleanlar sadece iki farkli deger alabilir. True yada false
        //Ornek 3 : boolean data type nda emekli misin icin bir variable olusturun ve false degerini atayin
        boolean emeklimisin = false;

        //byte data type : tam sayilar icindir. hafizada 1 byte yer kaplar.
        //byte: -128 den +127 ye kadar tamsayi degerleri kullanilir.
        //ornek 4 : byte data type nda ogrenci yasi icin bir variable olusturun ve deger atayin.
        byte studentAge = 30;

        //short data type : tam sayilar icindir.hafizada 2 byte yer kaplar.
        //short : -32768 ile 32767 arasindaki tamsayilar icin kullanilir.
        //ornek 5 : site nufusu icin bie variable olusturun ve deger atayin.
        short sitePopulation = 1300;

        //int data type : tam sayilar icindir. hafizada 4 byte yer kaplar.
        //int -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir.
        //ornek 6 : ulke nufusu icin bir variable olusturun ve deger atamasi yapin.
        int countryPopulation = 85000000;

        //long data type : tam sayilar icindir.hafizada 8 byte yer kaplar.
        //long 9,223,372,836,854,775,808 ile 9,223,372,836,854,775,807 arasindaki sayilar icindir.
        //ornek 7 : insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note : Bir deger long ise sonuna "L" veya "l" konulur.
        long cellNumberInHumanBody = 6765468009875L;

        //Eger lon a atadiginiz deger int lerin araliginda ise sonuna 'l' koymaya gerek yok.
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder.

        long weightOfSun = 1358693;

        //float data type : Virgullu sayilar(ondalikli sayilar==>decimal numbers) icin kullanilir.
        //float hafizada 4 byte yer kaplar.
        //Note : java ondalikli sayilari yani "Decimal Numbers" i otomatik olarak "double" kabul eder.
        //eger float data type i olmasinda israr ederseniz sonuna "F" yada "f" koymalisiniz.

        //ornegin fiyatlandirmalar icin tercih edilebilir (12,99)
        //ornek 8 : gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazin.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.99F;
        System.out.println(shirtPrice + shoesPrice);

        int a = 12;
        int b = 13;
        System.out.print(a);
        System.out.println(b);
        //System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar
        //System.out.print(); ekrana yazdirir ve pointer i ayni satirda tutar

        //double data type : Virgullu sayilar(ondalikli sayilar==>decimal numbers) icin kullanilir.
        //memoride daha fazla yer(8 byte) kaplar.virgulden sonraki rakam daha fazla alir.
        //ornek 9: Hucrenin agirligi ve amipin agirligi icin iki tane variable olusturun ve agirliklari farkini konsola yazdirin.
        double weightCell = 0.0000000000000112;
        double weightAmip = 0.0000000000000023;

        System.out.println(weightCell - weightAmip);




    }
}

