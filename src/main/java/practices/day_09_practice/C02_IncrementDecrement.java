package practices.day_09_practice;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        int a = 15;
        int b = a++; //Once assign et sonra arttir

        System.out.println(b); //15
        System.out.println(a); //16

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        sayi2 = sayi1++;
        System.out.println(sayi2); //10
        System.out.println(sayi1); //11

        sayi3 = ++sayi1;
        System.out.println(sayi3); //12  sayi1'de en son 11 oldugu icin
        System.out.println(sayi1); //12
        System.out.println(sayi3++); //12  Once yazdir sonra arttir
        System.out.println(sayi3); //13
        System.out.println(--sayi2); //9  Once eksilt sonra yazdir

        sayi2++;
        System.out.println(sayi2); //10

        System.out.println(sayi2--); //10
        System.out.println(sayi2); //9

        System.out.println(sayi3++); //13
        System.out.println(sayi3); //14



    }
}
