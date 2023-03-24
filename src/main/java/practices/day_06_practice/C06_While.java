package practices.day_06_practice;

import java.time.LocalDate;
import java.util.Scanner;

public class C06_While {
    public static void main(String[] args) {

        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        int c = number;

        while(number%10!=0){
            System.out.print(number + " ");
            number++;
        }

        System.out.println(" ");
        for(int i=c; i%10!=0; i++){
            System.out.print(i+" ");

        }



    }
}
