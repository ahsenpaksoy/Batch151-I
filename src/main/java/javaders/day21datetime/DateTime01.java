package javaders.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now(); // now() method u static cunku LocalTime class'la birlikte calistirdik
        System.out.println(myCurrentTime); //19:04:37.424094100

        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour); //19

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//7

        int second = myCurrentTime.getSecond();
        System.out.println(second);//15

        int nano = myCurrentTime.getNano();
        System.out.println(nano);

        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        //"HH" 24'luk saat sistemini ,  "hh" 12'lik saat sistemini kullanir.("hh:mm a")
        //"hh:mm a" ifadesindeki " a" 12'lik saat sisteminde "AM", "PM" yazilmasini saglar.
        //"HH:mm:ss" "ss" saniyeyi gosterir.
        //"mm" "minute" demektir. "MM" "month" demektir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");

        String formattedMyCurrentTime = dtf1.format(myCurrentTime); //format() method'u hep String verir.
        System.out.println(formattedMyCurrentTime); //19:20for

        //Date formati nasil degistirilir?
        LocalDate myCurrentDate = LocalDate.of(2022,8,25); //of() methodu LocalDate classiyla cagrildigi icin statistir.
        System.out.println(myCurrentDate);//2022-08-25


        //Tarihi Ay/Gun/Yil sekline ceviriniz.
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedmyCurrentDate1 = dtf2.format(myCurrentDate); //format() method'u hep String verir.
        System.out.println(formattedmyCurrentDate1); //08/25/2022


        //Tarihi Gun/Ay isminin ilk 3 harfi/Yil sekline ceviriniz.
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedmyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedmyCurrentDate2);//25/Aug/22

        //Tarihi Gun/Ay ismi/Yil sekline ceviriniz.
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);//25/August/2022

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?


        //Tokyo'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo); //2023-03-17


        //Tashkent'te ayin kaci?
        LocalDate dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);//2023-03-16

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);// 02:51:40.163147700

        //Berlin'de saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//18:51:40.163147700







    }
}
