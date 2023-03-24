package practices.ssgforloop;

public class C03_ForLoop {
    public static void main(String[] args) {

         /*
        soru 3)0'dan 100'e(dahil) kadar olan tek ve cift sayıları iki ayrı dongu ile yazdırın.
        */

        for (int i = 0; i <=100 ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){

                System.out.print(i+" ");

            }
        }

    }
}
