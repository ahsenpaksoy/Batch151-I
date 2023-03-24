package practices.ssgdowhileloop;

import java.util.Scanner;

public class C02_DoLoop {
    public static void main(String[] args) {

        //kullanicidan pozitif bir tamsayi alip
        //do  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int son=scan.nextInt();
        int bas=1;
        if (son>0) {
            do {
                System.out.print(bas + " ");
                bas++;
            } while (bas < son);
        }else System.out.println("lutfen gecerli bir sayi giriniz(pozitif tamsayi)");
        System.out.println("\n"+"****************");

        for (int i = 1; i <son ; i++) {
            System.out.print(i+" ");
        }



    }
}
