package javaders.day03methodcreationscanner;

public class C02_MethodCreation {
    
    /*
    Java da method nasil olusturulur?
    1) Method main in disinda olusturulur
    2) Tekrar tekrar kullanmamiz gerekiyorsa method olustururuz
      Access Modifier + Return Type + method ismi + () + {}
      
      Islem yapilacak olan sayilari methodIsmi()  parantezin icine eklenir (parametreler)

      Scope == Kapsam Alani bir variable in bir degerin  hangi alanda kapsam icinde oldugunu gosterir
     */
    
    
    public static void main(String[] args) {

        //Dikdortgenin alanini hesaplatan bir method olusturunuz
        dikdortgenAlani(10, 20);

        // Karenin alanini hesaplatan methodu yaziniz
        System.out.println(kareAlani(8)+2);
        
        // 1) Verilen iki sayiyi toplayan methodu olusturun
        add(20,54);
;        
        // 2) Verilen iki sayiyi carpan methodu yaziniz
        multiply(46,12);

        // 3) Verilen 3 sayidan ilk ikisini carpan ve sonucu
        // ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
        System.out.println("Ilk ikiyi carp ucuncuyu topla : " + firstTwoMultiplyThirdAdd(2, 3, 5)/10);

        // 4) Verilen bir ondalikli sayinin kupunu hesaplayip kullandiran bir method olusturunuz
        double sayininKupu = getCube(5.6);
        System.out.println("sayininKupu = " + sayininKupu);

        // 5) Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        System.out.println("daireninCevresi = " + daireninCevresi(2));


    }

    private static int daireninCevresi(int r) {
        return 2*314*r/100;
    }

    static double getCube(double v) {
        return v*v*v;
    }

    public static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a*b+c;
    }

    private static void multiply(int a, int b) {
        System.out.println(a*b);
    }

    static void add(int a, int b) { 
        // Access Modifiers default oldugu icin bir sey yazilmadi
        System.out.println(a+b);
    }

    private static int kareAlani(int c) {
        return c * c;

        //int kAlani = c*c;
        //System.out.println(kAlani);
        //return kAlani;
    }

    private static void dikdortgenAlani(int a, int b) {
        System.out.println(a * b);
    }
}
