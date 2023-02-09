package day02datatypesmethodcreation;

public class MethodCreation01 {
    /*
    java da method nasil olusturulur?

    1) main method un disinda class in icinde olusturulur.
    2) Access Modifier + Return Type + Method Name + () + {}

    Olusturulan method lar nasil kullanilir?
    1) main method un icinden kullanilir.
    2) method un ismi + () yazin
    3) islem yapacaginiz parametreleri parantez icine koyun
     */

    public static void main(String[] args) {
       int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

       long carpmaSonucu = multiply(3,6);
        System.out.println(carpmaSonucu);

       int ucluSonuc = firstTwoMultiplyThirdAdd(2,3,4);
        System.out.println(ucluSonuc);

        System.out.println(getCube(5));

        print("Hello World");

    }

    //Ornek1 : toplama islemi yapan bir method olusturun
    //main method static oldugu icin main method icinde kullanacaginiz hersey static olmalidir.
    public static int toplamaYap(int a, int b){
       return a+b;
    }

    //Ornek 2 : iki sayiyi carpma islemi yapan method olusturun.
    protected static long multiply(int a, int b){
        return a*b;
    }

    //Ornek 3 : Verilen uc sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method u olusturun
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;

    }

    //Ornek 4 : verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.
    //Note : Access Modifier i default yapmak icin access modifier YAZMAYINIZ.
    static double getCube(double a){
        return a*a*a;

    }

    //Ornek 5 : girilen bir kelimeyi ekrana yazdiran bir method olusturup kullanin.
    public static void print(String str){
        System.out.println(str);

    }
    //method un return type i void ise method body icinde return keyword yazilmaz.
    //eger bir method yeni bir data uretmiyor ise return type i void olur.






}
