package practices.day_11_practice;

public class C02_Static {

    static String okulIsmi = "Yildiz Koleji";
    static int okulNo;      //deger atamak zorunda degiliz
    static boolean okulAcikMi;

     /*
    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım
   */

    public static void main(String[] args) {
        // static variable'lara class icerisindeki tum method'lardan direkt ulasabiliriz.

        System.out.println(okulIsmi);
        System.out.println(okulNo);
        System.out.println(okulAcikMi);

        // static variable'lar gokteki ay gibidir.
        // static variable'lar class'a baglidir.
        // static variable'lar'in degeri bir kisi tarafindan degistirilirse herkes icin degisiklige ugrar.

        okulNo = 102;
        System.out.println(okulNo); //102

        staticMethod();
        System.out.println(okulNo); //200


    }

    private static void staticMethod() {
        okulNo = 200;
        System.out.println(okulNo); //200
    }

}
