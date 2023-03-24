package practices.ssgdowhileloop;

import java.util.Scanner;

public class C04_DoLoop {
    public static void main(String[] args) {

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        System.out.println("Merhabalar toplama merkezine hosgeldiniz girdiginiz tamsayilari toplayacak siz 0'a basana kadar");
        do {
            System.out.println("lutfen toplamak istediginiz sayilari giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }while (sayi!=0);
        System.out.println("toplam sayi : "+toplam);


    }
}

