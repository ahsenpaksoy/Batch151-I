package suleymanhoca.day09stringmanipulations;

import java.sql.DataTruncation;
import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str = "Java is easy";

        // indexOf() method'u verilen character veya characterlerin "ilk gorunumunun" index'ini verir.
        int idxA1 = str.indexOf("a");
        System.out.println("idxA1 = " + idxA1);

        // lastIndexOf() method'u verilen character veya characterkerin "son gorunumunun" index'ini verir.
        int idxA2 = str.lastIndexOf("a");
        System.out.println("idxA2 = " + idxA2);

        String str2 = "Kara kara dusunme Ankara";

        int indx = str2.indexOf("kara");
        System.out.println("indx = " + indx); // indexOf() un icinde coklu karakter kullaninca ilk harfin indexini verir
        int indx1 = str2.lastIndexOf("kara");
        System.out.println("indx1 = " + indx1);

        String s = "Mississipi";

        int idxI = s.indexOf('i'); // indexOf() hem String hem de char ile  kullanilabilir
        System.out.println("idxI = " + idxI); //1
        int idxIss1 = s.indexOf("iss"); // ilk gorunumun ilk karakterinin indexini verir
        System.out.println("idxIss1 = " + idxIss1); // 1
        int idxIss2 = s.lastIndexOf("iss"); // Son gorunumun ilk karakterinin indexini verir
        System.out.println("idxIss2 = " + idxIss2); // 4

        // Example 1: Bir String'deki bir character'in tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz
        //          "Helloooo" ==> H->Tekrarsiz   e->Tekrarsiz   l->Tekrarli    o->Tekrarli

        String t = "Helloooo";
        char c = 'H';

        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra
        // istenen character'in ilk gorunumunun index'ini return eder.
        int sonuc = u.indexOf("a",6); // ilk 6 karakterden sonra a nin ilk gorunumunu verir
        System.out.println(sonuc);
        int sonuc1 = u.indexOf("n",5); // ilk 5 karakterden sonra n'nin ilk gorunumunun indexi
        System.out.println(sonuc1);//14

        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip
        //en bastan bu indexe kadar olan karakterleri bir kutu icine aliniz ve lastIndaxOf() methodunu sadece bu kutu icindeki
        //String icin kullaniniz.
        String m = "Hello everyone!";
        int e = m.lastIndexOf("e",7);
        System.out.println("e = " + e);//6
        int e2 = m.lastIndexOf("e",10);
        System.out.println("e2 = " + e2);//8


        String v = "Java is Java";
        //isEmpty() method'u bir String'in bos olup olmadigini kotrol eder.
        //Eger String'de hic character yoksa "true" return eder, herhangi bir character varsa "false" return eder.
        // length()==0 demek isEmpty() true verir demektir.
        //Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty" kullanin.
        boolean bosMu = v.isEmpty(); // Verilen Strind'de karakter yoksa true der. Varsa false der
        System.out.println("bosMu = " + bosMu);//false

        String x = "";
        //isBlank() hem bos String icin hem de sadece space iceren String ler icin true return eder.
        boolean blankMi = x.isBlank();
        System.out.println("blankMi = " + blankMi);//true

        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az bir character icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);
        }




    }
}
