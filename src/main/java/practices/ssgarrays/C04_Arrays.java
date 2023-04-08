package practices.ssgarrays;

public class C04_Arrays {

    public static void main(String[] args) {
        /*
        5.soru Verilen bir int array'deki
        en buyuk sayiyi yazdiran bir method olusturun.
        */
        int arr[]={19,57,41,32,7,6,8};

        maxSayiYazdir(arr);

    }
    public static void maxSayiYazdir(int []arr){
        int maxSayi=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxSayi){
                maxSayi=arr[i];
            }
        }
        System.out.println("array icindeki en buyuk sayi : "+maxSayi);
    }

}
