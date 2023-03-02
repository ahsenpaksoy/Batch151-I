package practices.day_01_practice;

public class C03_Ascii {
    public static void main(String[] args) {

        // CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız

        /* ASCİİ

          B ==> 66           C ==> 67
          D ==> 68           E ==> 69
          L ==> 76           M ==> 77

        */

        char ilkKarakter = 'B'+1; // C
        char ikinciKarakter = 'D'+1; // E
        char ucuncuKarakter = 'L'+1; // M
        System.out.println("" + ilkKarakter + ikinciKarakter + ucuncuKarakter);
        // Basa String ("") ekleyince charlar da Stringe donustu

        System.out.println(((char)67) +""+ ((char)69) + ((char)77));

        int firstChar = 67;
        int secondChar =69;
        int thirdChar =77;
        System.out.print(""+((char)firstChar) + ((char)secondChar)+((char)thirdChar));





    }
}
