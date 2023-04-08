package practices.ssgarrays;

public class C05_Arrays {

    static String enKisaKelimeler="";
    static String enUzunKelimeler="";
    public static void main(String[] args) {
        /*
        6.Soru -Verilen String bir array'de en uzun
        ve en kisa String'leri yazdıran bir method olusturun
        */
        String isimler[]={"furkan","veli","huseyin","hakan","ali","ece","isa","cem"};
        enUzunVeEnKisa(isimler);

    }
    public static void enUzunVeEnKisa(String[] isimler){
        String enUzunKelime=isimler[0]; String enKisaKelime=isimler[0];

        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].length()>enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }
            if (isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];

            }

        }
        for (int i = 0; i < isimler.length; i++) {
            if ((enKisaKelime.length()==isimler[i].length())) {

                enKisaKelimeler+=" "+isimler[i];

            }
            if (enUzunKelime.length() == isimler[i].length()) {
                enUzunKelimeler+=isimler[i]+" ";
            }
        }
        if (enUzunKelime.length()==enUzunKelimeler.length()-1){
            System.out.println("Arraydeki en uzun kelime : "+enUzunKelime);
        }else System.out.println("Arraydeki en uzun kelimeler : "+enUzunKelimeler);
        if (enKisaKelime.length()==enKisaKelimeler.length()-1){
            System.out.println("Arraydeki en kisa kelime : "+enKisaKelime);
        }else System.out.println("Arraydeki en kisa kelimeler : "+enKisaKelimeler);

    }

}

    /*
         7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
    true veya false sonucu donen bir method olusturun.
     8.soru Kullanicidan bir array'in boyutunu ve tum elementlerini alarak bir array olusturup, bu array bize donduren bir method olusturun
    9.soru-Verilen bir array'e yeni bir element ekleyin
     */
