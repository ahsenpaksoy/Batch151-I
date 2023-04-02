package practices.day_10_practice;

    /*
          sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
          Bu instance variable'leri main icerisinde yazdıralım
    */
public class C03_Instance {
        int sayi;   //0
        String bransIsmi = "Java";
        boolean okuldaMi;  //false

        public static void main(String[] args) {

            C03_Instance obj1 = new C03_Instance();

            System.out.println(obj1.sayi); // 0

            System.out.println(obj1.bransIsmi); //Java

            System.out.println(obj1.okuldaMi); //false

            //instance variable'lar object'e baglidir.
            //hangi object uzerinden variable'da degisiklik yapildiysa, yapilan bu degisiklik sadece o object'i baglar.

            obj1.sayi = 10;
            System.out.println(obj1.sayi); //10

            C03_Instance obj2 = new C03_Instance();
            System.out.println(obj2.sayi); //0

            obj1.bransIsmi = "SQL";
            System.out.println(obj1.bransIsmi); //SQL

            System.out.println(obj2.bransIsmi); //Java

            System.out.println(obj1.okuldaMi); //false
            obj1.okuldaMi = true;
            System.out.println(obj1.okuldaMi); //true
            System.out.println(obj2.okuldaMi); //false

            obj2.sayi = 100;
            System.out.println(obj2.sayi); //100

            obj2.bransIsmi = "API";
            System.out.println(obj2.bransIsmi); //API
            System.out.println(obj1.bransIsmi); //SQL


        }
    }

    //instance variable main method disinda olusturuyoruz. Instance variablelar object ile cagrilir
    //static yazmiyorsa ve main method'un disindaysa instance variable'dir.
    //instance variable'lara static method'dan ulasabilmek icin object olusturmak gerekir.
