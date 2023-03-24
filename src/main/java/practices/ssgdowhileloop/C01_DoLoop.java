package practices.ssgdowhileloop;

public class C01_DoLoop {
    public static void main(String[] args) {

        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin
        //1.yol
        // for (int i = 5; i <=10 ; i++) {
        //     System.out.print(i+" ");
        // }
        // System.out.println("\n"+"****************");
        int j=5;
        do {
            System.out.print(j+" ");
            j++;
        }while (j <=10);
        System.out.println("\n"+"****************");
        j=11;
        while (j<=10){
            System.out.print(j+" ");
            j++;
        }



    }
}
