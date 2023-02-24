package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        //******************* isEmpty ***************************\\
        /*
        isEmpty() methodu bos mu dolu mu diye bakar. Boolean bir deger dondurur.
        Sadece hiclikte true dondurur
         */
        //Ex : Bir String in hic karakter icermedigini gosteren kodu yaziniz

        String str = "";
        //1. Yol length()
        boolean bosMu = str.length()==0;// 2 is yaptirildi length() + ==0 ile karsilastirma operatoru kullanildi
        System.out.println("bosMu = " + bosMu); //true

        //2. Yol isEmpty()
        boolean bosMu2 = str.isEmpty();// 1 is yaptirildi isEmpty(). makbul olan budur
        System.out.println("bosMu2 = " + bosMu2); //true

        //Ex : Bir String in bosluk haric hicbir karakter icermedigini kontrol eden kodu yaziniz"
        String str2 = "  ";

        //1. yol
        boolean result = str2.replace(" ","").length()==0;
        System.out.println("result = " + result);//true
        //2. yol
        boolean result2 = str2.replace(" ","").isEmpty();
        System.out.println("result2 = " + result2);//true

        //Ex : Bir String in "*" haric hicbir karakter icermedigini kontrol eden kodu yaziniz"
        String str3 = "*";
        boolean rslt = str3.replace("*","").length()==0;
        System.out.println("rslt = " + rslt);//true
        boolean rslt2 = str3.replace("*","").isEmpty();
        System.out.println("rslt2 = " + rslt2);//true

        //************************ isBlank() *******************************\\
        /*
        isBlank() methodu String bir datada space+hiclik icin true dondurur
        String datanin bos mu dolu mu oldugunu kontrol eder. Boolean bir deger dondurur.
        isEmpty() den farki varieble da sadece space varsa bosmu dolumu diye soruldugunda
        isBlank() == Bos der
        isEmpty() == Bos degil der
         */

        //String str2 = "  ";
        boolean rslt3 = str2.isBlank(); //space isBlank icin bir karakter degil
        System.out.println("rslt3 = " + rslt3);//true

        boolean rslt4 = str2.isEmpty(); //space isEmpty icin bir karakter
        System.out.println("rslt4 = " + rslt4);//false

        //************************** indexOf() ******************************\\
        /*
        indexOf() methodu verilen karakter veya karakterlerin ilk gorunumunun indexini verir
        Tekli karakter icin de coklu karakter icinde kullanilabilir
        int ve char karakter icin kullanilir
        Coklu datalarda String ifadenin ilk gorunumunun ilk karakterinin index ini dondurur.
        Olmayan bir datanin kacinci indexte oldugunu sorgulatirsak -1 dondurur.
         */

        //Ex : Bir String de a,i,e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yzdirin
        String r = "Java is easy to Learn";

        int aIndx = r.indexOf('a');
        System.out.println("aIndx  = " + aIndx );//1  Ilk gordugu a harfinin index i
        int iIndx = r.indexOf('i');
        System.out.println("iIndx = " + iIndx);//5
        int eIndx = r.indexOf('e');
        System.out.println("eIndx = " + eIndx);//8
        int sum = aIndx + iIndx + eIndx;
        System.out.println("sum = " + sum);//14

        //Ex : Bir String de "Java" kelimesinin ilk olarak kacinci index te kullanildigini
        //gosteren kodu yaziniz.
        String u = "Ah Java vah Java sen ne guzel seysin Java";
        int idxJava = u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);//3 // Coklu datalarda datanin ilk harfinin index ini verir.

        int idxPhyton = u.indexOf("Phyton");
        System.out.println("idxPhyton = " + idxPhyton); // -1  Olmayan data da -1 dondurur

        //***************************** lastIndexOf() ******************************\\
        /*
        LastIndexOf() String bir data da verilen karakter veya karakterlerin son gorunumunun index lerini verir.
        Olmayan bir datanin kacinci indexte oldugunu sorgulatirsak -1 dondurur.
         */

        //Ex : Bir String de a,i,e karakterlerinin son gorunumlerinin indexleri toplamini ekrana yazdirin
        String v = "Java is easy to Learn";


        int aLastIndx = r.lastIndexOf('a');
        System.out.println("aLastIndx  = " + aLastIndx );//18  Son gordugu a harfinin index i
        int iLastIndx = r.lastIndexOf('i');
        System.out.println("iLastIndx = " + iLastIndx);//5
        int eLastIndx = r.lastIndexOf('e');
        System.out.println("eLastIndx = " + eLastIndx);//17
        int sumLast = aLastIndx + iLastIndx + eLastIndx;
        System.out.println("sumLast = " + sumLast);//40


    }
}
