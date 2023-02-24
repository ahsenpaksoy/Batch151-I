package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {

    /*

    Java da sonucta bir urundur. Oracle firmasinin bir urunudur. Developer lar sadece data barindiran
    primitive data type larinin non-primitive ler gibi method da barindirmasini istemislerdir.Bunun
    uzerine Java primitive data type larina method ekleyerek ozel bir class olusturmustur.
    Buna da wrapper(sarmalamak.durum) class denir.

       Primitive                  Non-Primitive
        byte                        Byte
        short                       Short
        int                         Integer  ***
        long                        Long
        float                       Float
        double                      Double
        boolean                     Boolean
        char                        Character ***

     */
    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        // byte data type nin en buyuk ve en kucuk degerini ekrana yazdirin
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        System.out.println(maxByte); //127
        System.out.println(minByte); //-128


        // int data type inin max degeri ile byte data type nin min degerinin toplamini hesaplatan methodu olusturun
        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin + intMax = " + (byteMin + intMax));

        // ****************Primitive Data Type larini Wrapper Class lara nasil ceviririz?********************
        float primitiveFloat = 12.33F;
        Float wrapperFloat = primitiveFloat; // buna Autoboxing denir == Otomatik Kutulama Java bunu otomatik olarak yapar.
        // Kucuk kutuyu buyuk kutuya yerlestirir.

        //**************** Wrapper Classlari Primitive Data Type larina Nasil Ceviririz?******************
        Character wrapperChar = 'a';
        char primitiveChar = wrapperChar; // Unboxing kucuk kutuyu buyuk kutudan cikarma. Java bunu da otomatik yapar.


        //Example : Verilen iki String datanin toplamini veren kodu yaziniz
        String str1 = "12345";
        String str2 = "687";
        System.out.println("str1 + str2 = " + (str1 + str2));

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        // valueOf() methodu String bir datayi Integer a donusturur

        /*
        Java da "+" sembolu iki int icin matematikteki gibi toplama yapar.
        Iki String data arasinda ya da bir String bir int arasinda ise yan yana yazdirir buna "Concatination" denir.
        Yani toplama ve birlestirme yapar.
        Java matematikte islem onceligine gore calisir.
        uslu sayi - parantez - carpma,bolme - toplama,cikarma
         */

        String harf = "A";
        int sayi = 7;
        // harf + sayi ==> A7  sonuc string olur

        /*
        8+3+"K" ==> 11K  sonuc string olur

        "K"+3*5/2 ==>
         */

        String a = "K";
        int b = 3, c=5, d=2;
        System.out.println(a+b*c/d); // K7  int oldgu icin virgullu kismi siler (K7.5)


    }
}
