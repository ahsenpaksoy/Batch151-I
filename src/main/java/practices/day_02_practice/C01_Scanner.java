package practices.day_02_practice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

       //Ex : Kullanicidan aldiginiz bir sekil ile asagidaki sekli olusturan kodu yaziniz
        /*

                  A     // 2 space+ ch + 2 space
                 A A    // 1 space + ch + 1 space +ch + 1 space
                A A A  //  1 ch + 1 space +1 ch + 1 space+ 1 ch
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz...");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);


       /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char ch = input.next().charAt(0);

        String str="AAA";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(str.charAt(i)+ " ");
            }
            System.out.println();
        }
        */


        // Ex : Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin
        // sonuclarini ekrana yazdiran basit bir hesap makinesi kodunu yaziniz
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        System.out.println(sayi1 + sayi2);
        System.out.println(sayi1 - sayi2);
        System.out.println(sayi1 * sayi2);
        System.out.println(sayi1 / sayi2);

       /*
       public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("yapacaginiz islemi  x + / - olarak seciniz...: ");
            char islem = scan.next().charAt(0);

            System.out.print("islem icin birinci sayiyi giriniz :");
            double sayi1 = scan.nextDouble();

            System.out.print("islem icin ikinci sayiyi giriniz :");
            double sayi2 = scan.nextDouble();

            hesapMakinesi(islem, sayi1, sayi2);

        }

        public static void hesapMakinesi(char islem, double sayi1, double sayi2) {
            switch (islem) {
                case 'x':
                    System.out.println(sayi1 + "*" + sayi2 + " = " + (sayi1 * sayi2));
                    break;
                case '+':
                    System.out.println(sayi1 + "+" + sayi2 + " = " + (sayi1 + sayi2));
                    break;
                case '/':
                    System.out.println(sayi1 + "/" + sayi2 + " = " + (sayi1 / sayi2));
                    break;
                case '-':
                    System.out.println(sayi1 + "-" + sayi2 + " = " + (sayi1 - sayi2));
                    break;
                default:
                    System.out.println("dort islem harici bir secim yaptiniz..");
            }
   */

        //Ex : Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki rakamlari toplamini bulan kodu yaziniz


        //input 12345 ==>1+2+4+5
        //output==>12

        // 1.Yol
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int num = input.nextInt();//12345

        int ilkIkiRkm = num/1000;
        System.out.println("ilkIkiRkm = " + ilkIkiRkm);

        int ilkIkiToplam = (ilkIkiRkm%10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);

        int sonIkiRkm= num%100;//45
        int sonIkiRkmToplam = (sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiRkmToplam = " + sonIkiRkmToplam);
        int toplam=ilkIkiToplam+sonIkiRkmToplam;
        System.out.println("toplam = " + toplam);


        //2. Yontem
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int number = input.nextInt();//12345

        // Son rakami al
        int sonRakam = number%10;   //5
        //Sayiyi Kucult
        number = number/10;    // 1234

        //Sondan ikinci rakami al
        int sondanIkinciRakam= number%10;   // 4
        number = number/10;               // 123

        //Sondan ucuncu rakami al
        int sondanUcuncuRakam =number %10;   // 3
        number = number/10;                 // 12

        //Sondan dorduncu rakami al
        int sondanDorduncuRakam=number%10;  //2
        number=number/10;                   //1

        //Sondan besinci rakami al
        int sondanBesinciRakam=number%10;  // 1
        System.out.println(sonRakam+sondanIkinciRakam+sondanDorduncuRakam+sondanBesinciRakam);








    }
}
