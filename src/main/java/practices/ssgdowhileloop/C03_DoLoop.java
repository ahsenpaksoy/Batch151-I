package practices.ssgdowhileloop;

import java.util.Scanner;

public class C03_DoLoop {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin
        Scanner scan=new Scanner(System.in);

        int sayilar=0;
        int toplam=0;


        do {


            System.out.println("lutfen toplamak istediginiz sayilari giriniz");
            sayilar= scan.nextInt();
            toplam+=sayilar;

        }while (toplam<500);
        System.out.println("toplam sayi bu kadar oldu yeter artik kapasitemi asiyor : "+toplam);




    }
}
