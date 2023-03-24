package practices.ssgforloop;

import java.util.Scanner;

public class C05_ForLoopV2 {
    public static void main(String[] args) {
        /*
        kullanicidan 100den kucuk bir tamsayi isteyiniz ve o sayidan 1 kadar 3un kati olan sayilari yazdiriniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100den kucuk bir tam sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi<100&&sayi>0) {
            for (int i = sayi; i > 1; i--) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }

            }

        }else System.out.println("lutfen 100dan kucuk 0dan buyuk bir tamsayi giriniz");
    }
}
