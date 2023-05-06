package javaders.day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {

        //Example 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).forEach(System.out::println);

        //lines() method'u stream'e cevirdigi icin stream method'larini direkt kullanabiliriz.
        //lines methodu Paths.get ile calisir.
        //Satirlar oldugu icin "ln" i silmedik

        /*

    Notlar :

           1) lines methoduna dosya yolunu yazmak için Paths classından get methodunu kullanmalıyız.
           2) foreach() methodu ile satır satır okuma yaptık.
           3) Files classındaki lines methodu datayı Stream olarak verir. Bu sebeple stream'deki bütün
              methodları burada kullanabiliriz.

 */

        //Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.
        Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //Example 3: Verilen text file icindeki textlerde "Java" kelimesinin olup olmadigini kontrol eden code'u yaziniz.
        boolean r1 = Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        //Example 4: Verilen text file icindeki textlerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}", "")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream). //flatMap() array duvarlarini yikar elemanlari stream icine koyar.
                distinct(). //kelimelerden tekrarli olanlari bir kere alacak
                collect(Collectors.toList()); //listin icine koyacak

        System.out.println(words);

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        long numOfLetters = Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println(numOfLetters);

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
        //icinde return eden kodu yaziniz.
        List<String> letters =   Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(letters);

        System.out.println("Finish");





    }
}
  //Lambdada iki tip method var.Bazi methodlar noktadan sonra yeni method gostermeyebilir.Bunlara terminal method denir.
  //Digeri de kendisinden sonra method gosteren methodlar.
  /*
    Lambda da iki tür method var.
    1-Terminal Method: Kendisinden sonra method kabul etmez.sum(), count() gibi.
    2-Kendisinden sonra method kabul eden methodlar.
 */

