package introduction.day02datatypesmethodcreation;

public class Variables01 {
    /*
    Java'da temelde iki tip data vardir.
    1)primitive data type:
      char, boolean, byte, short, int, long, float, double
    2)non-primitive data type:
      String

    Note1 : primitive data type lari java olusturmustur, biz olusturamayiz.
    Note2 : primitive data type larin isimlerinde sadece kucuk harf kullanilir.
    Note3 : primitive data lar type larina gore memory de farkli yer kaplarlar.
    Note4 : primitive data lar iclerinde sadece sizin atadiginiz degeri barindirir.

    Non-primitive Data Types
    Ornek olarak String non-primitive bir data type dir.
    Uretilen her bir class ayni zamanda bir "non-primitive data type" dir.Bu yuzden "non-primitive data type"lar sinirsiz sayidadir denilebilir.
    Non-primitive data type larin isimleri buyuk harflr baslar.
    Non-primitive data type larin tamami icin java memory de ayni miktarda yer ayirir.

     */

    public static void main(String[] args) {
        //Ornek1 : Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin.
        String cityName = "Ankara";
        System.out.println(cityName);

        /*
        Interview sorusu : primitive ve non-primitive data type lar arasindaki fark nedir?
        1)primitive ler sadece bizim atadigimiz degeri icerir.
          non-primitivler bizim atadigimiz deger ve method lar icerir.
        2)primitivler kucuk harfle baslar, non-primitivler buyuk harfle baslar
        3)primitivleri java uretmistir ve 8 tanedir
          non-primitivleri java ve developer lar uretebilir, sinirsiz sayidadir.
        4)primitivler memory de data type na gore yer kaplar, non-primitiv data type larin tamami icin java memory de ayni miktarda yer ayirir.
         */

    }
}
