package javaders.day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {
    public static void main(String[] args) {

        String s = "Hello Henry!";
        System.out.println(getTheNumOfOccurenceOfLetters(s));
        //String method'un icine yazilir.

    }

    //Example 1: Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
    //           "Hello Henry!"==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
    public static TreeMap<String, Integer> getTheNumOfOccurenceOfLetters(String s){

        //String'deki harf disi character'leri sil.
        s = s.replaceAll("[^A-Za-z]","");

        //Gorunum sayilarini depolamak icin bir Map olustur.
        TreeMap<String,Integer> numOfOccurence = new TreeMap<>(); //Alfabetik sirada yazdirmak icin TreeMap kullandik

        //Harfleri al
        String letters[] = s.split("");

        //for-each loop
        for(String w : letters){
            Integer numOfOcc = numOfOccurence.get(w); //get method'u value'sunu verir
            if(numOfOcc==null){
                numOfOccurence.put(w,1);
            }else{
                numOfOccurence.put(w,numOfOcc+1);
            }
        }
        return numOfOccurence;

    }
}
/*
  once HashMap ile yaptik fakat alfabetik sira olsun diye TreeMap' cevirdik beoylelikle alfabetik bur siraya sahip olduk..
  Javada alfabetik sirada once buyuk harf ardindan kucuk harf gelir. Cunku buyuk harf ascii value'si kucuk harflerinkinden kucuktur.
 */

// Maplar non-primitivelerle çalışır.Collections'larda ayni sekilde. o yuzden wrapper class kullandik
