package suleymanhoca.day08stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Example 1: Bir String deki space haric kac tane karakter kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ==> 14
        String str = "Ali okula gitti.";

        // replace() method u bir String deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir
        int num = str.replace(" ","").length();
        System.out.println(num);

        //Example 2: Bir String deki tum 'a' harflerini buyuk 'A' ya ceviriniz
        String s = "Ankara'nin tasina gozlerimin yasina bak.";
        String newS = s.replace("a","A");
        System.out.println(newS); //AnkArA'nin tAsinA gozlerimin yAsinA bAk.

        //Example 3: Bir String deki "kara" kelimelerinin yerine "*" koyunuz
        String t = "Kara kara dusunme Ankara";
        String newT = t.replace("kara","*");
        System.out.println(newT); //Kara * dusunme An*

        //Example 4: Bir String deki tum sayilari "*" a ceviriniz
        //            "AC202117004" ==> AC*********
        String stdId = "AC202117004";
        String newStdId = stdId.replaceAll("[0-9]","*");
        System.out.println(newStdId); //AC*********

        /*
            Bir grup datayi ifade eden kodlara "Regex" denir.
            "Regex" Regular Expressions in kisaltilmis halidir.

            1)Tum rakamlar ==> [0-9]
            2)Tum kucuk harfler ==> [a-z]
            3)Tum buyuk harfler ==> [A-Z]
            4)Tum Harfler ==> [a-zA-Z]
            5)Sesli Harfler ==>[aeiouAEIOU]
            6)Space ==> [ ]
            7Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\p{Punct}

            1)Rakamlar haric tum karakterler ==>[^0-9]
            2)Kucuk harfler haric tum karakterler ==> [^a-z]
            3)Buyuk harfler haric tum karakterler ==> [^A-Z]
            4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
            5)Space haric ==> [^ ]

         */

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        //            tum karakterlerin sayisini bulan kodu yaziniz
        String u = "Ali 13 yasinda, dersem inanma!...";
        int result = u.
                       replaceAll("[0-9]","").
                       replace(" ","").
                       replaceAll("\\p{Punct}","").
                       length();
        System.out.println(result); //22

        //Example 6: Bir password un gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az bir sembol icermeli
        //           iii)En az bir rakam icermeli
        //           iv)En az bir buyuk harf icermeli
        //           v)En az bir kucuk harf icermeli

        String pwd = "B78c? K!m";

        //i)Space haric en az sekiz karakter olmali
       boolean first =  pwd.replace(" ","").length()>7;

        //ii)En az bir sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;

        //iii)En az bir rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;

        //iv)En az bir buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;

        //v)En az bir kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if(pwdGecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else{
            System.out.println("Password'unuz gecerli degildir...");
        }

        //Example 7: Bir String deki noktalama isaretlerinin sayisini gosteren kodu yazin
        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);

        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //           aksi halde "Normal" yazdirin.
        String v = "Alex";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String sonuc = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(sonuc);

    }
}
