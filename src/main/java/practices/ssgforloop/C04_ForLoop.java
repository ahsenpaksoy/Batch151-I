package practices.ssgforloop;

public class C04_ForLoop {
    public static void main(String[] args) {

        /*
        Soru 4) 100'den baslayarak 50'ye (dahil) kadar olan sayilari
        aralarinda virgul olarak ayni satirda yazdirin
        */
        for (int i = 100; i >=50 ; i--) {
            if (i>50){
                System.out.print(i+",");
            }else System.out.print(i);
        }

    }
}
