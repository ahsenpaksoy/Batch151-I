package javaders.day07stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //************************* endsWith() *******************************\\
        /*
         endsWith() metnin bir datayla bitip bitmedigini bize verir.
         True ya da false seklinde boolean bir deger dondurur.
         Icerisine tek karakterde coklu karakterde koyabilirsiniz.
         */

        //Ex : s String inin "money" ile bitip bitmedigini kotrol ediniz
        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd); //true

        String s2 = "Learn Java earn money";
        boolean iceriyorMu = s2.contains("money");
        System.out.println("iceriyorMu = " + iceriyorMu);

        /*
        Contains() methodu cumlenin herhangi bir yerinde istenilen datayi bulursa true dondurur.
        Ancak task in bizden istedigi "money" kelimesiyle bitip bitmedigi oldugu icin endsWith() kullanmaliyiz.
         */

        //************************* replace() *******************************\\

        //Ex : s String indeki "money" kelimesini "dollar" kelimesiyle yer degistirelim
        String s1 = s.replace("money","dollar");
        System.out.println("s1 = " + s1); // Learn Java earn dollar

        //Ex : s String indeki "earn" kelimesini "win" kelimesine ceviriniz.
        String s3 = s.replace("earn","win");
        System.out.println("s3 = " + s3); // Lwin Java win money

        //Ex : s String indeki "a" harfini "*" ile degistiriniz.
        String s4 = s.replace('a','*'); // makbul olan budur
        String s5 = s.replace("a","*");
        //String s6 = s.replace("a",'*');
        System.out.println("s4 = " + s4); //Le*rn J*v* e*rn money

        //Ex : s String indeki "L" harfini "***" ile degistiriniz.
        String s6 = s.replace("L","***");
        System.out.println("s6 = " + s6); // ***earn Java earn money

        //Ex : s String indeki tum "e" harflerini siliniz
        String s7 = s.replace("e","");
        System.out.println("s7 = " + s7); // Larn Java arn mony
        String s8 = s.replace('e',' ');
        System.out.println("s8 = " + s8); // L arn Java  arn mon y.  Space ile silme yapilmaz.Space in
        // java icin bir anlami vardir ve bir karakterdir. Taskte istenilen saglanmis olur

        //Ex : s String indeki tum "earn" kelimelerini siliniz
        String s9 = s.replace("earn","");
        System.out.println("s9 = " + s9); // L Java  money

        String t = "Dolma Kalem";
        //Ex : t String indeki "Kalem" kelimesi yerine "Biber" yerlestiriniz
        String t1 = t.replace("Kalem","Biber");
        System.out.println("t1 = " + t1); // Dolma Biber



    }
}
