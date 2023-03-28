package javaders.day24inheritancepolymorphism;

public class CarRunner {
    public static void main(String[] args) {

        Toyota t1 = new Toyota();
       // t1.model = "Prius";
       // System.out.println(t1.model);

        //System.out.println(t1.toString());

        Honda h1 = new Honda();
        String s = "Ali";

        Volvo v1 = new Volvo();
        v1.move();


    }
}


        //Constructorlar javada yukaridan asagiya calisir
        //Butun Constructor'larin ilk satirinda gorunmez bir kod vardir ==> super();
        //Bu kod Parent'i temsil eder ve parent'e yonlendirir

        /*
           Java diyor ki once parent'i sonra child'i olustur. Burada once Car sonra Toyota'yi olusturduk.
        Java once Car'i calistirir. Yani once onu yazdirir, sonra asagidaki constructorlari calistirir.
        Biz Java'ya Toyota(); constructor'ini calistir, icinde parametre olmayani calistir dedik.
        Bu constructor Toyota uretecek, ama once parent'i olan Car'in uretilmesi gerekir.
        Her constructor'in ilk satirinda gorunmez kodu vardir. O da super() seklindedir.
        Super parent demektir. O yuzden once parent'e gidilir.
        Car'in da parent'i varsa oradaki constructor da super parantez nedeniyle kendi parent'ina gider.
        En tepeden Object Class'tan calismaya basladi asagilara kadar geldi.
        Bizi yukariya tasiyan kod su super keyword'udur. Bu sizi parent'daki constructor'a tasir.
         */

    /*
      CarRunner Class'tan constructor'a giderken CarRunner icindeki object parantezi icinde parametre koyduysak, ilgili
        Class'a gider ve icinde parametresi olani bulup calistirir.

        Toyota Class'i icinde iki constructor var. Parametresi String olani kullanacagiz. Parametresi String olan
        constructor {} icinde ilk satirda super(5)'i ekledik. Bu durumda CarRunner'dan Car Class'ina gidilir
        ve oradaki constructorlardan parametresi tam sayi olana gidecek ve onu calistiracak.
        Car Classi icinde constructorlardan birinin parametresi int i idi. 5 sayisina en uygun buydu, bunu calistirdi.
        Ekrana Car constructor 2 yazildi.

        Daha sonra super(5)'i alt constructor'dan ust constructor'a koyduk. Toyota Class icindeki ust constructor parametresiz
        Java bu durumda hangisini sececek? Java bu nedenle once parametresiz olana gidecek. Bunun icinde super(5) var. 5'in bulundugu
        yere bakinca integer oldugu anlasiliyor. Java Car class'i icinde once parametresi int olana gider onu calistirir.
        Ekranda once Car constructor 2'yi goruruz, daha sonra parametresiz constructor'a gider ve onu calistirir. Ekranda daha sonra
        Toyota constructor 1'i goruruz.
     */