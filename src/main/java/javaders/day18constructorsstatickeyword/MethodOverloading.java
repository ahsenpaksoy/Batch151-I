package javaders.day18constructorsstatickeyword;

public class MethodOverloading {

    /*
        1)Bir method ayni isim ve farkli parametrelerle olusturulursa buna "Method Overloading" denir.
        2)"Method Overloading" Java'da iyi organizasyon icin onemlidir.
        3)"Method Overloading" yaparken parametre uc sekilde degistirilebilir.
            i)Parametrelerin sayilari degistirilebilir.
            ii)Parametrelerin data type'larini degistirebilirsiniz.
            iii)Parametrelerin data type'lari farkli ise yerleri degistirebilir.
     */
    public static void main(String[] args) {


    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static double add(double a, int b){
        return a+b;
    }

    public static double add(int a, double b){
        return a+b;
    }





}
