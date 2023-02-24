package javaders.day08stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //************************** replaceFirst() ********************************\\
        /*
        replaceFirst() : replace ile ayni isi yapmakla birlikte ilk gordugu datayi degistirir.
         */

        String str = " Bizimle Java Ogrenmek Cok Kolay";
        //Ex : str String indeki ilk gordugu "i" harfinin yerine "e" harfi yerlestiriniz.
        String str1 = str.replaceFirst("i","e");
        System.out.println("str1 = " + str1);
        String str2 = str.replace("i","e");
        System.out.println("str2 = " + str2);

        //****************************** trim() ********************************\\
        /*
        trim() Bir String de bastaki ve sondaki space karakterlerini siler
        ortadaki space karakterlerine dokunmaz.
         */
        String isim = "   Mehmet Fatih Yildirim  ";
        //Ex : isim String indeki varsa bas ve sondaki spaceleri siliniz
        String trimIsim = isim.trim();
        System.out.println("trimIsim = " + trimIsim);

        //Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        String tv = "599.99$";
        String laptop = "299.99$";

        String tv2 = tv.replace("$","");
        System.out.println("tv2 = " + tv2);//"599.99"
        String laptop2 = laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);//"299.99"

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);//899.98
        System.out.println(Double.valueOf(tv2));


        /*
        valuOf() String olan bir datayi sayisal bir degere yani
        islem yapabilecegimiz bi degere cevirir
         */

        //**************************** split() ***************************\\
        String tamIsim = "  mehmet fatih   ";
        //Verilen tamIsim String inin icindeki ilk ismin ilk harfiyle son ismin
        // ilk harfini buyuk harf olarak yan yana yazdiriniz

        char first = tamIsim.trim().toUpperCase().charAt(0);
        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("first + second = " + first + second);// MF


    }
}
