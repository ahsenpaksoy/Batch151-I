package practices.ssgforloop;

public class C02_ForLoop {
    public static void main(String[] args) {

         /*
        Soru 2) 10 ile 30 arasindaki(10 ve30 dahil) sayilari aralarinda
        virgul olarak ayni satirda yazdirin
        */
        for (int i = 10; i <=30 ; i++) {

            if (i<30) {
                System.out.print(i + ",");
            }else System.out.println(i);
        }

    }
}
