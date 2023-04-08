package practices.kahvemakinesi;

import java.util.Scanner;

public class Machine {

    static String hangiKahve="";
    static Scanner scan = new Scanner(System.in);
    static String kahveBoyut ="";

    public static void main(String[] args) {

        giris22();

    }

    private static void giris22() {
        do {

            System.out.println("Hangi kayveyi istersiniz?\n1. Turk Kahvesi\n2. Filtre Kahve\n3. Espresso");
            hangiKahve = scan.nextLine();
            if(!hangiKahve.equalsIgnoreCase("Turk Kahvesi") && !hangiKahve.equalsIgnoreCase("Filtre Kahve") && !hangiKahve.equalsIgnoreCase("Espresso")){
                System.out.println("hatalı tuslama yaptınız");
            }

        }while(!hangiKahve.equalsIgnoreCase("Turk Kahvesi") && !hangiKahve.equalsIgnoreCase("Filtre Kahve") && !hangiKahve.equalsIgnoreCase("Espresso"));
        System.out.println(hangiKahve + " hazırlanıyor");

        sutEkleme();

    }

    private static void sutEkleme() {
        System.out.print("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
        String scm = scan.next();
        if (scm.equalsIgnoreCase("evet")){
            System.out.println("Süt ekleniyor...");
        }else if (scm.equalsIgnoreCase("hayir")){
            System.out.println("Süt eklenmiyor");
        }

        sekerEkleme();

    }

    private static void sekerEkleme() {
        System.out.print("Şeker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    ");
        String scm = scan.next();
        if (scm.equalsIgnoreCase("evet")){
            System.out.println("Kaç şeker olsun?");
            int kacSeker=scan.nextInt();
            scan.nextLine();        // dummy  int girdisinden sonra str girdisi yapılacağı için boş atlıyorum
            System.out.println(kacSeker+" şeker ekleniyor...");
        }else if (scm.equalsIgnoreCase("hayir")){
            System.out.println("Şeker eklenmiyor");
        }

        kayveBoyutu();

    }

    private static void kayveBoyutu() {

        do {
            System.out.println("Hangi boyutta olsun? (büyük boy - orta boy - küçük boy olarak giriniz");
            kahveBoyut = scan.nextLine();

            if (!kahveBoyut.equalsIgnoreCase("Büyük boy") &&  !kahveBoyut.equalsIgnoreCase("orta boy")   &&   !kahveBoyut.equalsIgnoreCase("küçük boy")){
                System.out.println("Hatalı tuslama yaptınız");

            }

        }while(!kahveBoyut.equalsIgnoreCase("Büyük boy") &&  !kahveBoyut.equalsIgnoreCase("orta boy")   &&   !kahveBoyut.equalsIgnoreCase("küçük boy")   );
        System.out.println("kahveniz " + kahveBoyut + " hazırlanıyor");

        sonucKahve();
    }

    private static void sonucKahve() {
        System.out.println(hangiKahve+" "+ kahveBoyut+" Hazırdır. Afiyet olsun !!!");

    }

}

/*
    @channel arkadaslar herkese hayırlı gunler dılıyorum umarım hersey yolundadır ve hrkes ıyıdır bır kahve sıparısı projesı bırakıyorum buraya
    taska uyyun cozumlerı beklıyoruz gruptan arkdaslar kolay gelsın sımdıden
12:36
1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
 3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
 Örn:  Hangi Kahveyi İstersiniz?  1.Türk kahvesi  2.Filtre Kahve  3.Espresso
        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
        (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)                                                                                     todo 1. Koşul bölümü        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
  todo ----------------------------------
        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
           "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
       String sut olusturun.

todo 2.Koşul Bölümü       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
      -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.
      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.

 todo ----------------------------------
        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) :
         " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.        String seker oluşturunuz.                                                                todo 3.Koşul Bölümü        todo if(){        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.        Şeker sayısını giriniz.        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)        todo }        todo else{    Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.

            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor.
            (String bosKod = sc.nextLine();   )  dummy kod ekleyiniz.

  Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun.
  (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.  String boyut oluşturun...

 todo 4.Koşul Bölümü        eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor.
  (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
        Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
        Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)

  //todo  SONUÇ BÖLÜMÜ
                    Siparişlerimizi verdik. Son hali görmek istiyoruz.                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)
        todo Açıklama :
       Projeyi bilerek biraz zor hazırladık. Üzerinde fazla fazla kafa yormanız ve "grupça çalışmanız için" böyle düzenledik.
        Yapamayan arkadaşlar kesinlikle canlarını sıkmasın.
        Size çok zor gelebilir. Ancak adım adım ilerlerseniz, grup ile çözerseniz ve yazdığım notları tamamen uygularsanız halledebilirsiniz.
         Öğrenmediğiniz hiçbir şey yok. Sadece biraz karışık.
       Ancak arkadaşlarınızla beraber live _Channel larda ödev üzerine tartışabilirsiniz.
       HERKESE KOLAY GELSİN !!
     */
