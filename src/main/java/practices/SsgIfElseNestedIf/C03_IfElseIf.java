package practices.SsgIfElseNestedIf;

import java.util.Scanner;

public class C03_IfElseIf {
    public static void main(String[] args) {

        // girilen bir karakterin, harf olup olmadigini bulalim
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char ch = scan.next().charAt(0);

        if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("Girdiginiz karakter bir harf");
        }else{
            System.out.println("giridiginiz karakter bir harf degil");
        }


        //Kullanicidan iki sayi isteyin,
        //sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        //sayilarin ikisi farkli isaretlere sahipse
        //“farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        //sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        System.out.println("Lutfen iki sayi giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1>0 && num2>0){
            System.out.println("girdiginiz iki sayida pozitif oldugu icin toplamalari : "+ (num1 + num2));
        }else if(num1<0 && num2<0){
            System.out.println("girdiginiz iki sayi negatif oldugu icin carpimlari : "+ (num1 * num2));
        }else if(num1 * num2 <0){
            System.out.println("farkli isaretlere sahip oldugu icin islem yapamazsiniz");
        }else{
            System.out.println("sifir carpmaya gore yutan elemandir");
        }


        // bir kisinin kan bagisinda bulunup bulunamayacigini control ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 dan ust olmali

        Scanner input = new Scanner(System.in);
        System.out.println("Kan vermek icin annenden izin aldin mi(true ve false giriniz");
        boolean izinVerdiMi = input.nextBoolean();

        if(izinVerdiMi){
            System.out.println("Lutfen yasinizi giriniz");
            int yas = input.nextInt();

            if(yas>=18){
                System.out.println("Lutfen kilonuzu giriniz");
                double kilo = input.nextDouble();

                if(kilo>50){
                    System.out.println("Kan bagisinda bulunabilirsiniz");
                }else{
                    System.out.println("Kilo al gel");
                }
            }else{
                System.out.println("Buyu de gel");
            }

        }else{
            System.out.println("Lutfen izniniz olmadigi icin izin alip gelin");
        }







    }
}
