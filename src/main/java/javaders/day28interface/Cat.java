package javaders.day28interface;

public class Cat implements Mammal{
    @Override
    public void eat() {
    }

    @Override
    public void drink() {
    }

    public static void main(String[] args) {
        //interface'lerde variable cagirirken "interface" adini kullanarak cagirin.
        //Bu hem "static" variable olmanin geregidir, hem de okunurlulugu artirir.
        System.out.println(Animal.age);  //butun variable'lar cagrilirken interface ismi ile cagrilir.
        System.out.println(Mammal.feedBaby);
        System.out.println(Mammal.age);
    }

}

    //interface class'in child'i olmaz.
    //variable ve method'lari ararken once kendi class'ina bakar, yoksa parent'a bakar orda olmasa
    //bi ust class'a bakar.

