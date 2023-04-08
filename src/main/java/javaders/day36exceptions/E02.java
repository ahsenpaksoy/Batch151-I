package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

    public static void main(String[] args) {

        //2.Way:
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/TextFile");

            int i = 0;

            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            System.out.println("Some characters could not be read");
        }
    }
}
    /*

    * try kisminda birden fazla exception olusturma ihtimali olan kod varsa, coklu catch kullanabilirsiniz.
            * Coklu catch kullandiginizda Exception classlar arasinda parent-child iliskisi yoksa catch'lerin sirasi
            önemli degildir. Ama kod daki siralamaya uymak tavsiye edilir.
            * Coklu catch kullandiginizda Exception classlar arasinda parent-child iliskisi varsa catchlerin sirasina
            dikkat etmeliyiz, child class ustte olmalidir.
            * Exception classlar arasinda parent-child iliskisi varsa
                   =>ya child classi uste yazarak child ve parent icin ozellestirilmis codelar yazarsiniz
                   =>yada child i hic kullanmaz sadece parent ile exceptionlari handle etmeye calisirsiniz.

     */
