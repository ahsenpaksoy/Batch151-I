package javaders.day18constructorsstatickeyword;

public class MethodOverloading {

    /*
        1)Bir method ayni isim ve farkli parametrelerle olusturulursa buna "Method Overloading" denir.
        2)"Method Overloading" Java'da iyi organizasyon icin onemlidir.
        3)"Method Overloading" yaparken parametre uc sekilde degistirilebilir.
            i)Parametrelerin sayilari degistirilebilir.
            ii)Parametrelerin data type'larini degistirebilirsiniz.
            iii)Parametrelerin data type'lari farkli ise yerleri degistirebilir.
        4)"Method Overloading" bir class'in icinde olusur bu yuzden "private" methodlar da overload edilebilir.
           "Method Overloading" butun access modifier'larda kullanilabilir.
        5)"static" methodlar overload edilebilirler.
     */
    public static void main(String[] args) {

        add(3,5);

    }

    private static int add(int a, int b){
        return a+b;
    }

    private static int add(int a, int b, int c){
        return a+b+c;
    }

    private static double add(double a, int b){
        return a+b;
    }

    private static double add(int a, double b){
        return a+b;
    }





}
