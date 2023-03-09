package javaders.day14loops;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {

        //Kullanicidan alinan bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz
        //1838 ==> 1+3 = 4
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String s = input.next();

        int sum = 0; // Yeni datayi memory ye yerlestirmek icin bir variable a ihtiyac var

        for(int i=0; i<s.length(); i++){
            String d = s.substring(i,i+1);
            if(s.indexOf(d) == s.lastIndexOf(d)){
                sum = sum + Integer.valueOf(d);
                //intiger ile string toplanmaz bu yuzden string olan d integer a cevirilir.
                //bunun icinde integer valueOf(d) ile yapariz
            }
        }
        System.out.println(sum);
        //indexOf() ve lastIndexOf() String lerde kullanilir


        //Bir String'deki tekrarli character'leri ekrana yazdiran kodu yaziniz
        //Alabala ==> la

        String t = "Alala";
        String result = "";



        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);                    //contains() String le calisir, char la calismaz.
            if((t.indexOf(ch) != t.lastIndexOf(ch)) && !result.contains("" + ch)){
                result = result + ch;

            }

        }
        System.out.println(result);









    }
}
