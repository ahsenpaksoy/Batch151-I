package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence
        //Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1
        //"I like you, like like!" => I=1,   like=3,  you=1

        String s = "I like you, like like!";
        System.out.println(s); //I like you, like like!

        //like ile like! i ayni yapabilmek icin tum noktalama isaretlerini silelim.
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s); //I like you like like

        //Ben kelimelerle calismaliyim bu yuzden split(" ") kullanacagim.
        //Split() method'u her bir string parcasini array'e koyar
        String  words[] = s.split(" ");
        System.out.println(Arrays.toString(words)); //[I, like, you, like, like]

        //Cikti key value seklinde istendigi icin Map olsturuyorum.
        //Siralama istemedigi icin en hizlisi oldugundan dolayi HashMap kullanirim.
        HashMap<String,Integer> occ = new HashMap<>();

        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
        //"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
        //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for(String w : words){

            Integer numOfOccurence = occ.get(w);
            if(numOfOccurence==null){
                occ.put(w,1);
            }else{
                occ.replace(w,numOfOccurence+1); //value degistirilecekse replace kullanilir.put, eklemek icin kullanilir.
            }
        }
        System.out.println(occ); //{like=3, I=1, you=1}

    }
}
