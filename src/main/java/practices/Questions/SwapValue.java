package practices.Questions;

public class SwapValue {
    //İki değişkenin değerini değiştirme

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        /*** 1. Yol *****/
        //3. bir variable kullanarak takas

        int c = 0;
        c = a;
        a = b;
        b = c;

        /** 2. Yol ***/
        //3. bir variable kullanmadan takas
        a = a + b; //10'du artık 30 oldu.
        b = a - b; //20 idi artık 30-20 den 10 oldu ve a nın değeri b ye taşınmış oldu.
        a = a - b; //30 idi, artık 30 - 10 dan 20 oldu ve b nin değerinin a ya taşınması tamamlandı.

        System.out.println("Takastan sonra a 'nın değeri : " + a);
        System.out.println("Takastan sonra b 'nın değeri : " + b);

    }

}
