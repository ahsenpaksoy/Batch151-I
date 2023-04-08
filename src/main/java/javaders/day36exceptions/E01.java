package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

      /*
        1)Run Button'una bastiktan sonra console'da alinan Exception'lara "Runtime Exception" denir.
          ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
          "Runtime Exception" a ornektir.
          "Runtime Exception" lara "Unchecked Exception" da denir.

        2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
          FileNotFoundException, IOException "Compile Time Exception" a ornektir.
          "Compile Time Exception" lara "Checked Exception" da denir.

        3)FileNotFoundException: Java'ya bir dosyayi bul dedigimizde, Java "dosyanin adresi" ve "dosyanin varligi" konusunda
                                 hata olusursa ne yapmasi gerektigini soylemenizi ister.

        4)IOException: "IO" Input Output demektir.
                       Note: IOException, FileNotFoundException'in parent'idir.

        5)Java da hata'lar temelde 2 ye ayrilir.
            i)Exception'lar   ii)Error'lar: a)StackOverflow Error b)Out Of Memory Error  c)Virtual Machine Error
            Heap memory doldugunda StackOverflow hatasi verir, Huge memory doldugunda Out Of Memory Error hatasi verir.

            Exceptionlar hayatin sonu degil bir cesit cozum uretebiliyoruz, ama Error'lar hayatin sonudur cozum uretemeyiz..
            Exception'lar handle edilebilir ama Error'lar asla handle edilemezler.
     */

    public static void main(String[] args) throws IOException {

        //1.Way: Exception'i mathod signature satirina ekledik
        FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/TextFile");

        int i = 0;

        while((i = fis.read())!=-1){
            System.out.print((char)i); //i ascii deger oldugu icin char'a cevirdik.
        }
        //read() method'u character'lerin ascii degerlerini verir. ascii degeri i'nin icine koyuyoruz.
        //ascii deger -1 olmadigi surece loop'u calistir. Butun character'ler bitince read -1 verir.
        //read() method'u butun satirlar bitince -1 verir.

    }
}

    //FileInputStream class'i, dosyayi iceri alan bir method. Object olusturacagiz cunku icinde dosya
    //okumaya yarayan bircok method var.


/*
       Compile Time Exception:

    1)FileNotFoundException(Dosya bulunamadi hatasi)
    Javadan bir dosyayi bulmasini istediginizde java dosyanin adresi ve dosyanin varligi konusunda hata olusursa
    ne yapmasi gerektigini de soylemenizi ister.
    Ona ne yapmasini soylersek ayrica javayi bu dosyanin silinmedigi konusunda rahatlatmamiz gerekir.

    2)IOException(Input-Output)
    Bu exception input ve output ile ilgili tum problemleri handle edebilir. Application'imiza data girdisi yaptigimizda veya data ciktisi yapabiliriz. Dosyanin bulunmasi halinde oradaki datayi kullanabiliriz. Oyleyse dosyanin bulunmasi input ile alakali bir operasyondur. IOException bu nedenle FileNotFoundException'in parent'idir. Genel olan spesifik olanin parent'i olur. Bu durumda parent catch block'da ona gore sirasini alir.
    Coklu catch block yapmazsak, o zaman sadece IOExeption'i kullaniriz.
 */

/*read methodu gelecek ilk character olan "L" yi alir. Aslinda characteri degil Ascii degerini alir.
L nin Ascii degeri 76 , while ici 76 aldi. 76 esit degil -1 diyoruz
Ifade dogru oldugu icin 76 yi char'a cevirecek ve buyuk L olarak yazdiracak.Bu sekilde devam eder.
Read methodu butun satirlar bittiginde -1 dondur. Ve sonuc olarak -1 esit degildir -1 diyecegi icin
Loop kirilir.

 */

