package practices.day_13_practice;

public class C02_StaticKeyword {

    // Bu class calıstıgında output ne olur. Calısma mantıgı nedir
    static int y;
    int x;
    public C02_StaticKeyword(int i) {

        x+=i;  //gelen i degerini x'e ekledik
        y+=i;  //gelen i degerini y'ye ekledik
    }
    public static void main(String[] args) {

        C02_StaticKeyword obj1 = new C02_StaticKeyword(2);
        C02_StaticKeyword obj2 = new C02_StaticKeyword(3);
        System.out.println(obj1.x + ", " + obj2.x + ", " + y);
    }

}
