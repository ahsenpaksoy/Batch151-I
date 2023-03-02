package javaders.day13loops;

public class Loops02 {
    public static void main(String[] args) {

        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        // "Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){        //break lopp larda veya switch statementlerde kullanilir.
                continue;                  //break loop un disina atar, continue increment e goturur.
                                           // continue loop yaparken bazi elemanlari isleme sokmamakta kullanilir.
            }else{
                System.out.print(ch);
            }
        }
        //"break" ile "continue" arasindaki fark nedir?
        //"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
        //"continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.

        System.out.println();

        //Bir String'i ters ceviren kodu yaziniz

        //1.Way
        String t = "Java";
        // yeni bir data olusturacagimiz icin her zaman memory de yeni bir konteynir olustururuz.
        String ters = "";
        for(int i=t.length()-1; i>=0; i--){
            ters = ters + t.substring(i,i+1);
           // System.out.println(ters); //her bir adimdaki degeri yazdirir
        }
        System.out.println(ters); //En son degeri verir

        //2.Way
        String u = "Java";
        String ters2 = "";

        for(int i=u.length()-1; i>=0;i--){
            ters2 = ters2 + u.charAt(i);  //String + char ==> String
        }
        System.out.println(ters2);

        System.out.println();

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20
        int sum = 0;
        int n = 578;
        n = Math.abs(n);
        for(int i=n; i>0; i/=10){
            sum += i%10;
        }
        System.out.println(sum);

        System.out.println();


        int sayi = 12345;
        int toplam = 0;
        for (int i =sayi; i >0 ; i--) {
            toplam+= sayi%10;
            sayi=sayi/10;

        }
        System.out.println(toplam);







    }
}
