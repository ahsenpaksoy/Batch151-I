package javasorubankasi;

public class IfStatement {
    public static void main(String[] args) {

       /* Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı"
        */
        String monthName = "Temmuz";
        monthName = monthName.toLowerCase();
        if(monthName.equals("aralik") || monthName.equals("ocak") || monthName.equals("subat")){
            System.out.println("Kis");
        }else if(monthName.equals("mart") || monthName.equals("nisan") || monthName.equals("mayis")){
            System.out.println("Ilkbahar");
        }else if(monthName.equals("haziran") || monthName.equals("temmuz") || monthName.equals("agustos")){
            System.out.println("Yaz");
        }else if(monthName.equals("eylul") || monthName.equals("ekim") || monthName.equals("kasim")){
            System.out.println("Sonbahar");
        }else{
            System.out.println("Gecersiz ay adi");
        }


        /*Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        */
        String pwd = "a1b2c3d4";
        if(pwd.replaceAll("[^ ]","").length()>0){
            System.out.println("Şifrede boşluk karakteri kullanmayınız");
        }else if(pwd.replaceAll(" ","").length()>7){
            System.out.println("Gecerli Sifre");
        }else{
            System.out.println("Gecersiz Sifre");
        }


        /*Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
        Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.
        */
        int monthNo = 7;
        if(monthNo==1){
            System.out.println("Ocak");
        }else if(monthNo==2){
            System.out.println("Subat");
        }else if(monthNo==3){
            System.out.println("Mart");
        }else if(monthNo==4){
            System.out.println("Nisan");
        }else if(monthNo==5){
            System.out.println("Mayis");
        }else if(monthNo==6){
            System.out.println("Haziran");
        }else if(monthNo==7){
            System.out.println("Temmuz");
        }else if(monthNo==8){
            System.out.println("Agustos");
        }else if(monthNo==9){
            System.out.println("Eylul");
        }else if(monthNo==11){
            System.out.println("Ekim");
        }else if(monthNo==12){
            System.out.println("Kasim");
        }else{
            System.out.println("Gecersiz ay numarasi");
        }


       /* Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
         c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
       */
        int a = 5;
        int b = 3;
        int c = 4;
        if(a==b && b==c){
            System.out.println("Eskenaar Ucgen");
        }else if(a==b && b!=c || a==c && b!=c || b==c && a!=c){
            System.out.println("Ikizkenar Ucgen");
        }else{
            System.out.println("Cesit Kenar Ucgen");
        }

       /*
        Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
        kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
        kodunuz "2" yazmalıdır (sayı dinamik olacak)
        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
        */
        double mil = 10;
        double saniye = 7200;
        double fahrenayt= 83;
        String operator = " fahrenaytdanSantigarata ";
        if(operator.equals("mildenKmye ")){
            System.out.println(mil*1.60934);
        }else if(operator.equals("saniyedenSaate ")){
            System.out.println((saniye /60)/60);
        }else if(operator.equals("fahrenaytdanSantigarata ")) {
            System.out.println((fahrenayt - 32) * 5 / 9);
        }











    }
}
