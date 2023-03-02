package javasorubankasi;

public class StringManipulation {
    public static void main(String[] args) {

        String s = "Sonuc ";
        Long a = 123L;
        Long b = 9123456782L;
        System.out.println(s + (a+b));
        System.out.println(s + a*b);

        double fiyat = 1.2;
        short yeniFiyat = (short) fiyat;
        System.out.println(yeniFiyat);

        byte age = 23;
        double newAge = age;
        System.out.println(newAge);

        byte sayi1= Byte.valueOf("103");
        short sayi2 = Short.valueOf("2351");
        System.out.println("sayi2-sayi1 = " + (sayi2 - sayi1));

        String sehirIsim = " mIAMI ";
        String konsolSehirIsim = sehirIsim.trim().toLowerCase();
        konsolSehirIsim = konsolSehirIsim.substring(0,1).toUpperCase() + konsolSehirIsim.substring(1);
        System.out.println("konsolSehirIsim = " + konsolSehirIsim);

        String name1 = "Ali Can";
        String name2 = "Aliye Canan";
        String name3 = "Aliyev Can Cananov";
        int c1 = name1.replace(" ","").length();
        int c2 = name2.replace(" ","").length();
        int c3 = name3.replace(" ","").length();
        int allCharacters = c1 + c2 +c3;
        System.out.println("allCharacters = " + allCharacters);

        String str = "  Miami 33018!!! ";
        int str1 = str.replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println("str1 = " + str1);

        int str2 = str.replaceAll(" ","").replaceAll("[\\p{P}]","").length();
        System.out.println("str2 = " + str2);

        String str3 = "2a3B4?-!5";
        int chNumber = str3.replaceAll("[0-9]","").length();
        System.out.println("chNumber = " + chNumber);

        String s1 = " Miami ";
        int lastChIndx = s1.trim().length()-1;
        String lastCh = s1.substring(lastChIndx,lastChIndx+1);
        System.out.println("lastCh = " + lastCh);

        String e = "Miami ";
        int boslukOlmayanSonKrkIndex= e.trim().length()-1;
        String boslukOlmayanSonKrk = e.substring(boslukOlmayanSonKrkIndex,
                boslukOlmayanSonKrkIndex +1);
        System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);

        String str4 = "Turkiye";
        int firstChAscii = str4.charAt(0);
        int lastChIndex = str4.length()-1;
        int lastChAscii = str4.charAt(lastChIndex);
        System.out.println("firstChAscii + lastChAscii = " + (firstChAscii + lastChAscii));

        String str5 = "Kahramanmaras";
        String exceptFirstCh = str5.substring(1);
        System.out.println("exceptFirstCh = " + exceptFirstCh);

        String str6 = "Istanbul";
        str6 = str6.toUpperCase().substring(0,str6.length()-1);
        System.out.println("str6 = " + str6);

        String str7 = "Malatya";
        int lastChaIndex = str7.length()-1;
        str7 = str7.substring(1,lastChaIndex).toUpperCase();
        System.out.println("str7 = " + str7);

        String u = "  Tom Hanks ";
        String uTrim = u.trim();
        String noSpace = uTrim.replaceAll(" ","");
        boolean isOneSpace = uTrim.length() - noSpace.length() == 1;
        System.out.println("isOneSpace = " + isOneSpace);

        String sa = "Tom Hanks.";
        char ilkKrk = sa.charAt(0);
        char sonKrk = sa.charAt(sa.length()-1);
        System.out.println("sonKrk = " + sonKrk);
        Boolean ilkKrkBuyukMu = ilkKrk >='A' && sonKrk <='Z';
        Boolean sonKrkNoktaMi= sonKrk =='.';
        Boolean ilkKrkBuyukSonKrkNoktaMi = ilkKrkBuyukMu && sonKrkNoktaMi;
        System.out.println("Ilk karakter buyuk harf, son karakter nokta mi? "+ilkKrkBuyukSonKrkNoktaMi);

        String sifre = "!1a23b4?es";
        boolean chrctr = sifre.replaceAll(" ","").length()>7;
        boolean sembol = sifre.replaceAll(" ","").replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println("Sifre gecerli mi? "+ (chrctr && sembol));

        String c = "Java";
        Boolean sonuc = c.indexOf("v")!=-1;
        System.out.println("karakteri iceriyor mu? " + sonuc);


        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";
        //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
        String d = gomlekFiyat.replace("$","");
        String f = kitapFiyat.replace("$","");
        double x = Double.valueOf(d);
        double y = Double.valueOf(f);
        System.out.println("Toplam fiyat : " + (x+y)/100);


        String name = "Tom Hanks";
        String firstLetter = name.substring(0,1);
        int surnameFirstLetterIndx = name.indexOf(" ")+1;
        String surnameFirstLetter = name.substring(surnameFirstLetterIndx,surnameFirstLetterIndx+1);
        System.out.println(firstLetter + surnameFirstLetter);

        String name4 = "Tom Hanks";
        char fistLetter = name4.charAt(0);
        char secondLetter = name4.split(" ")[1].charAt(0);
        System.out.println(firstLetter + secondLetter);

        String t = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
        int num = t.replaceAll("[a-zA-Z0-9]","").replaceAll(" ","").length();
        System.out.println("num = " + num);
        int num1 = t.replaceAll("[^\\p{P}]","").length();
        System.out.println("num1 = " + num1);


    }
}
