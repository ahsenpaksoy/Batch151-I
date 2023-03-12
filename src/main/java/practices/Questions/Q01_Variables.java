package practices.Questions;

import java.util.Scanner;

public class Q01_Variables {

    public static void main(String[] args) {
        //Bir variable baslat
        int age = 15;
        int number = 43;
        String isim = "Ali";
        System.out.println("isim = " + isim);
        System.out.println(age);
        System.out.println("number = " + number);  // number.soutv  kisa yolu

        //Variable degerini kopyala
        int myAge = age;
        System.out.println("myAge = " + myAge);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        //kodlari duzenlemek hizalamak icin  code-->reformat code , ctrl alt L

        //Ayni satirda coklu variable deklere et
        int year = 2022, month = 3,day = 15;
        System.out.println("month = " + month);
        System.out.println("year = " + year);

        //Bir variable degerini guncelle
        year = 2023;
        System.out.println("year = " + year);

        year = 2030;
        System.out.println("year = " + year);

        isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

        //Bir variable deklere et : x
        double x;

        //Bir variable başlat : y
        double y = 55.6;

        //Başka bir variable başlat : z
        double z = 10;

        //x değişkenini y değişkeni ile başlat
        x = y;

        //Variable'i güncelle
        x = 15.3;

        //Değişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }


    public static class Arrays02 {
        public static void main(String[] args) {

            //+, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
            //Kullanici "q" ya basmadigi surece islem secip yapabilsin

            /*
                1) Kullanicidan data almak icin Scanner object olustur
                2) Kullanicidan yapacagi islemi almaliyiz
                3) Kullanicidan iki tane sayi almaliyiz
                4) Tekrar tekrar islem yapabilmek icin loop kullanmaliyim
             */
            Scanner input = new Scanner(System.in);

            System.out.println("To stop calculation press q");
            char opr = ' ';  //Scope'u genisletmek icin buraya koyduk opr'yi

            do{
                System.out.println("Please enter the operation among +, -, *, /, %");
                opr = input.next().toLowerCase().charAt(0);

                if(opr=='q'){
                    System.out.println("See you again");
                    break;
                }
                boolean r = opr=='+' || opr=='-' || opr=='*' || opr=='/' || opr=='%';
                if(!r){
                    System.out.println("Undefined operation");
                    break;
                }

                System.out.println("Enter the first number");
                int n1 = input.nextInt();
                System.out.println("Enter the second number");
                int n2 = input.nextInt();

                switch(opr){
                    case '+':
                        System.out.println(n1 + "+" + n2 + " = " + (n1+n2));
                        break;
                    case '-':
                        System.out.println(n1 + "-" + n2 + " = " + (n1-n2));
                        break;
                    case '*':
                        System.out.println(n1 + "x" + n2 + " = " + (n1*n2));
                        break;
                    case '/':
                        System.out.println(n1 + ":" + n2 + " = " + (n1/n2));
                        break;
                    case '%':
                        System.out.println(n1 + "%" + n2 + " = " + (n1*n2)/100);
                        break;
                }

            }while(true);

            //Bir variable'i suslu parantezler disinda olusturunca calismaz


        }
    }
}
