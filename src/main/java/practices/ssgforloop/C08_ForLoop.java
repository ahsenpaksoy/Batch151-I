package practices.ssgforloop;

public class C08_ForLoop {
    public static void main(String[] args) {
        /*
        soru 8) input olarak girilen bir stringi forLoop kullanarak ters cevirin.
        */
        String str="Ali Can";
        String strBos="";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));

            strBos+=str.charAt(i);

        }
        System.out.println(strBos);

    }
}
