package practices.lambdapractice;

    import java.util.ArrayList;
    import java.util.List;
public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        elemanlariYazdir1(nums);
        System.out.println();
        elemanlariYazdir2(nums);
        System.out.println();
        ciftElYazdir(nums);
        System.out.println();
        ciftElYazdir2(nums);
        System.out.println();
        tekElKareYazdir(nums);
        System.out.println();
        tekSayilarinKupleriniTekrarsizYazdir(nums);
        System.out.println();
        System.out.println(benzersizCiftSayilarinKareleriTop(nums));
        System.out.println();
        benzersizCiftElKareCarpimiYazdır(nums);
        System.out.println();
        listedenMaxYazdir1(nums);
        System.out.println();
        listedenMaxYazdir2(nums);
        System.out.println();
        listedenMaxYazdir3(nums);
        System.out.println();
        listMinEleman(nums);
        System.out.println();
        minDeger(nums);


    }//main

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void elemanlariYazdir1(List<Integer> nums) {//12 9 131 14 9 10 4 12 15
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }
    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void elemanlariYazdir2(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        nums.stream().forEach(t -> System.out.print(t + " "));
    }
    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void ciftElYazdir(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");//12 14 10 4 12
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftElYazdir2(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekElKareYazdir(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));//81 17161 81 225
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekSayilarinKupleriniTekrarsizYazdir(List<Integer> nums) {
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));//729 2248091 3375
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static int benzersizCiftSayilarinKareleriTop(List<Integer> nums) {

        return nums.
                stream().
                distinct().//benzersiz elemanlar alindi
                        filter(t -> t % 2 == 0).//cift olanlari secildi
                        map(t -> t * t).
                reduce(Math::addExact).
                get();//456

    }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftElKareCarpimiYazdır(List<Integer> nums) {
        Integer benzersizCiftKareToplam = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(Math::multiplyExact).
                get();//45158400

        System.out.println(benzersizCiftKareToplam);
    }

    //9)Liste ogelerinden max degeri veren bir method olusturunuz
    public static void listedenMaxYazdir1(List<Integer> nums) {
        //1.Yol
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println("max = " + max);
    }

    public static void listedenMaxYazdir2(List<Integer> nums) {
        Integer max2 = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println("max2 = " + max2);
    }

    // 3.Yol
    public static void listedenMaxYazdir3(List<Integer> nums) {
        Integer max3 = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println("max3 = " + max3);
    }


    //10)Liste ogelerinden minumum degeri veren method olusturunuz

    public static void listMinEleman(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min = " + min);
    }

    public static void minDeger(List<Integer>nums){
        int minDeger = nums.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE,Integer::min);
        System.out.println("minDeger : "+minDeger);

        // baslangic degeri olarak max buyuk bir deger vermeliyiz akistan data alabilmesi icn
    }

}

  /*
       Limit
    Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını
    göstermemize yarayan,sınırlandıran bir metoddur. Parametre olarak
    vereceğimiz rakamla aslında Stream içerisinde dönen çok sayıda veri
    var ancak sen bize şu kadarını göster diyoruz.

    findFirst() => İlk elemanı verir. Optional return eder.

    split()=>Bu String öğesini verilen normal ifadenin eşleşmelerine böler.

    Comparator => bir Class'tır. Compar karşılaştırmak demektir.
    Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma
    işlevi.Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol
    sağlamak için bir sıralama yöntemine (Collections.sort veya Arrays.sort
    gibi) aktarılabilir.Karşılaştırıcılar, belirli veri yapılarının
    (sıralı kümeler veya sıralı haritalar gibi) sırasını kontrol etmek veya
    doğal sıralaması olmayan nesnelerin koleksiyonları için bir sıralama
    sağlamak için de kullanılabilir.

    reverseOrder() => Comparator Class'ının bir methodudur.
    Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator
    (karşılaştırıcı) döndürür.
    comparing() => karşılaştırma demektir.
    reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını
    uygulayan bir karşılaştırıcı (comparator) döndürür.


    skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu
    akışın kalan elemanlarından oluşan bir akış döndürür.
    Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür.
    Bu, durum bilgisi olan bir ara işlemdir.
    skip(list.size()-1) => List'in uzunluğunun 1 eksiğini yazarsak son
    elemanı yazdırırız.

    Stream:
    Datalari akisa sunar. Cok sayıda işlevsel metodun çağrılmasını sağlar

    ForEach:
    Stream içindeki veriyi tek tek tüketmek için oluşturulmuş bir yapıdır.
    **Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir ve
    artık kullanılamayacağı anlamına gelir.


    Filter:
    Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
    filtreleme işlemi yapmamıza yarayan bir yapıdır.
    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır


    Collect:
    Collect metodu Stream türündeki nesneleri başka biçimdeki nesneye,
    veri yapısına dönüştürmek için kullanılır.


    Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
    ve başka elemanlara dönüştürmemize imkan sağlayan


    Distinct:
    Stream içerisinde bulunan ve tekrar eden elemanlar varsa
    bunları distinct metodu ile çıkartabilir ve
    elimizde tekrar etmeyen birbirinden farklı
    elemanlar barından bir veri setimiz kalır


    Sorted:
    Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
    2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
    İkinci formatı ise Comparator arayüzünden türediği için
    bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.



    reduce : indirgeme demektir.
    kullanımı; elemanları teker teker işler. Bir önceki adımda elde edilen sonuç,
    bir sonraki elemanla işlemle tutulur


    Match operasyonu bir akışın belirli kriterleri sağlayıp sağlamadığını ölçmek için kullanılır.
    Map den farkı her iterasyonu tek tek değerlendirip sonucu yansıtmaz bunun yerine tüm koleksiyonu
    değerlendirerek sonucu yansıtmasıdır. Match operasyonunun 3 çeşit kullanımı bulunmaktadır;

        AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
        herhangi bir elemanla eşleşme durumunda true dönecektir.


        AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
        bu şarta uyması durumunda true dönecektir.


        NoneMatch: Şarta göre Stream içindeki hiç bir
        elemanın şartı sağlamaması durumunda true dönecektir.



    Comparator => bir Class'tır. Compar karşılaştırmak demektir.
    Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma işlevi.
    Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol sağlamak için bir
    sıralama yöntemine (Collections.sort veya Arrays.sort gibi) aktarılabilir.
    Karşılaştırıcılar, belirli veri yapılarının (sıralı kümeler veya sıralı haritalar gibi)
    sırasını kontrol etmek veya doğal sıralaması olmayan
    nesnelerin koleksiyonları için bir sıralama sağlamak için de kullanılabilir.

    reverseOrder() => Comparator Class'ının bir methodudur.tersten siralama yapar.
    Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator (karşılaştırıcı) döndürür.
    comparing() => karşılaştırma demektir.
    reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını
    uygulayan bir karşılaştırıcı (comparator) döndürür.

   */
