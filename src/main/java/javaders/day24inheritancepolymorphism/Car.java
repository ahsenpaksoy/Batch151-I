package javaders.day24inheritancepolymorphism;

    /*

        1)Inheritance'da object olustururken constructor'lar yukaridan(parent) asagiya(child) dogru calisir
        2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
        3)super() her constructor'in ilk satirinda gorunmez olarak bulunur.
          Isterseniz gorunur sekilde de yazabilirsiniz
        4)Super() sizi parent class'daki constructor'a tasir.
        5)this() sizi ayni class icindeki consructor'lar arasinda gezdirir.
          super() class'lar arasinda gezdirir.
          super() sizi parant class'daki constructor'a tasir.
        6)this() icinde bulundugunuz class'daki variable'lari cagirmaya yarar.
          "super()" parent class'daki variable'lari cagirmaya yarar.
        7)Eger data type'lari arasinda IS-A ve HAS-A iliskisi varsa bu data type'larina "COVARIANT" denir.

          parent'tan chil'a giderken HAS-A iliskisi vardir
          child'dan parent'a IS-A iliskisi vardir
     */

     /*
         1)Polymorphism ==> Coklu sekil demektir.
         Yani bir method'un farkli sekillerde karsimiza cikmasi demek.
         Polymorphism = Overloading + Overriding
         2)Overriding, parent class'daki method'u child class'in ihtiyaclarina gore ozellestirerek kullanmak demektir.
         3)Overriding'de method'un body'si degistirilir. (Overloading'de parametre degisir)
         4)Overriding'de method signature'a dokunulmaz. Dokunursaniz java kizar.

         Overriding parent'daki method'u child'lara gore ozellestirme islemi demektir.
      */

public class Car {

    public void move(){
        System.out.println("Cars move...");
    }
    public void getBreak(){
        System.out.println("Cars break...");
    }
    public void engine(){
        System.out.println("Cars have engine...");
    }
    public String model = "Car";
    public int price = 0;

    public Car(){
        System.out.println("Car constructor 1");
    }
    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }

}

  //Her class bir data type'dir. Her class urettigi object'nin kalibidir. Ayni zamanda urettigi datanin type'idir.
