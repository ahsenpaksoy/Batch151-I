package javaders.day28interface;

public interface Animal {
    void eat();  //bu method, yazilmasa da public ve abstract
    void drink();

    //1)interface'lerdeki tum variable'lar otomatik(default) olarak "final"dir.
    ////Baslatilmasi ve degistirilmemesi gerekir.
    //  Bu yuzden interface icindeki variable'i olusturdugunuzda mutlaka deger atamasi yapmalisiniz.
    //  Bilindigi gibi final variable'larin degerleri degistirilemez.
    //2)interface'lerdeki tum variable'lar otomatik(default) olarak "public" dir.
    //3)interface'lerdeki tum variable'lar otomatik(default) olarak "static" dir.

    int age = 4;

}

  //parent'daki abstract method'u kullanma zorunlulugu concrete child class'lar icin gecerli.
  //Mammal interface, concrete class degil o yuzden parent'daki method'u override etme zorunlulugu yok.
  //Bir interface'de method'larin body'si olmaz.
  //Illa method olacaksa Access Modifier' dan sonra default veya static koymali.

  //parent'larda abstract method olusturdugunuzda concrete child'lara gidin ve
  //mutlaka onlari override edin.yoksa hata olusur.