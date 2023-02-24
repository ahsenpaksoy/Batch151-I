package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {
    public static void main(String[] args) {

            /*

    Numeric Data Type'larinin birbirine donusturulmesine Type Casting denir
    Numeric Data Type'lari byte<short<int<long<float<double

    Kucuk Data Type'larinin Buyuk Data typelarina donusturulmesine
    "Auto Widening"(Otomatik Genisletme) denir ==> Kucuk Kutunun Buyuk Kutu
    icerisine yerlestirilmesi.

    Buyuk kutunun Kucuk kutuya donusturulmesinde Java sorumlulugu kabul etmez.
    Data kaybi olabilecegi icin code'u yazanlara birakir.Buna "Explicit Narrowing"
     (Aciktan Daraltma ) denir.


     */

        byte age = 13;
        int ageInt = age; //Auto Widening Java bunu otomatik olarak yapar

        //long data type ni short a cevirelim
        long population = 1234;
        short newPopulation = (short)population; //Explicit Narrowing Aciktan Daraltma

        //int data type ni float data type na ceviriniz
        int boy = 170;
        float boyFloat =boy; // Auto Widening

        // short data type ni byte data tipine cevirelim
        short numberShort = 115;
        byte numberByte = (byte)numberShort;

    }
}
