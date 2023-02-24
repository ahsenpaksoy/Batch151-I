package javaders.day03methodcreationscanner;

public class C03_MethodCreation {
    public static void main(String[] args) {

        //Dikdortgenin alanini hesaplatan bir method olusturunuz

        dikdortgenAlani(10, 20);

        // Karenin alanini hesaplatan methodu yaziniz
        System.out.println(kareAlani(8)+2);


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
