package javaders.day25polymorphism;

public class Student {

    public String stdName = "Tom Hanks";
    public int age = 23;

    //Encapsulation nedir? Data saklamaktir.(Dta hiding)
    //Access modifier'ini private yaparak diger class'lardan saklama isine denir.
    //Data'yi nasil saklarsin? Access Modifier'ini "private" yaparak.

    //Ozel datalarin butun class'lara acik olmasini engellememiz gerekir. Cunku bir data
    // tum classlara aciksa hacklenebilir


    private String stdId = "AC2023102T";
    private double gpa = 3.87;
    private boolean successful = false;

    //Encapsulation yaptigimiz datayi istersek diger class'lardan okuyabiliriz.
    //Nasil okuruz?  "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.
    //i)get method'lari hep "public" olur ii)get method'un "return type"i okudugu variable'in return type'i ile ayni olur.
    //iii)get method bir boolean variable icin olusturulursa ismi "is" ile baslar.

    public String getStdId() { //get method'lar public olurlar
        return stdId;
    }
    public double getGpa() {
        return gpa;
    }

    //Encapsulation yapilan variable'in data type'i "boolean" ise
    //get method ismi "is" ile baslar.
    public boolean isSuccessful() {
        return successful;
    }

    ///Encapsulation yaptigimiz datayi istersek diger class'lardan nasil degistirebiliriz?
    //Nasil degistirebiliriz? "set method" olusturarak Encapsulate edilmis data'nin degerini degistirebiliriz.
    //i)set method'lari hep "public" olur ii)set method'un return type'i hep "void" olur.
    //iii)set method parametre kullanir, parametrenin data type'i variable ile ayni olur.
    //iv)set method kullanarak varolan object uzerinde degisiklikler yaparak o object'i sanki yeni bir object'mis gibi kullanabiliriz.

    //Note : getmethod'larin diger sadi "gette", set method'larin diger adi "setter" dir.

    //set method'un return type'i hep void'dir.

    // class kalip, obje'ler o kaliptan uretilen nesnelerdir.
    // "set method"u ise nesneyi degistirmek icin kullanilir. Class'a dokunmaz
    //"get"ve "set" methodlari class'a dokunmaz objeleri degistirir
    //Java get ve set method'unu objeler uzerinde kullaniyor class'da degil.
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}





