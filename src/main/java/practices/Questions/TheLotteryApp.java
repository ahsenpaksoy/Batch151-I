package practices.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class TheLotteryApp {

    /*

          Create  n random numbers with user to generated for the ticket.
          Create  n random numbers  for the result of the lottery.
          There should be no repeated numbers in the numerical lottery.
          Take the min and max from user to use in the lottery...

          Compare the result and ticket than print  how many matches is there

*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kullanici Lutfen Alacaginiz Biletin Basamak Sayisini Giriniz...");
        int  biletNoSayis=sc.nextInt();


        System.out.println("Lutfen Bilette kullanabilecegimiz Maksimum Sayiyi giriniz...");
        int maks=sc.nextInt();

        System.out.println("Lutfen Bilette kullanabilecegimiz Minimum Sayiyi giriniz... ");
        int minu=sc.nextInt();

        if(maks<minu){
            int tem=maks;
            maks=minu;
            minu=tem;
        }


        int [] kullanicininBileti=new int[biletNoSayis];
        int idx=0;

        do{
            int randomsayi= (int) (Math.random() * ((maks+1) - minu) +minu);
            int count=0;
            for(int i=0;i<kullanicininBileti.length;i++){
                if(kullanicininBileti[i]==randomsayi){
                    count++;
                }
            }

            if(count==0){
                kullanicininBileti[idx]=randomsayi;
                idx++;
            }


        }while (idx<biletNoSayis);

        System.out.println(Arrays.toString(kullanicininBileti));

        int [] randomBilet=new int[kullanicininBileti.length];
        int idx1=0;

        do{
            int randomsayi1= (int) (Math.random() * ((maks+1) - minu) +minu);
            int count=0;
            for(int i=0;i<kullanicininBileti.length;i++){
                if(randomBilet[i]==randomsayi1){
                    count++;
                }
            }

            if(count==0){
                randomBilet[idx1]=randomsayi1;
                idx1++;
            }
        }while (idx1<randomBilet.length);


        System.out.println(Arrays.toString(randomBilet));


        int count=0;

        for(int i=0;i<kullanicininBileti.length;i++){
            if(kullanicininBileti[i]==randomBilet[i]){
                count++;
            }

        }

        if(count==kullanicininBileti.length){
            System.out.println("Tebrikler Buyuk Ikramiye Sizindir");
        }else if(count==0) {
            System.out.println("Malesef Hic Bir Sayi Tutturamdniz");
        }else {
            System.out.println("Tebrikler "+count+" Sayi tutturdunuz ");
        }


    }
}
