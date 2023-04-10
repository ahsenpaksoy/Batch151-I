package practices.deneme;

import practices.day_13_practice.C03_Varargs;

public class Den2_C03_Varg extends C03_Varargs { //method'un access modifier'i protected oldugu icin parent child yaptik.

    public static void main(String[] args) {
        String ad1="Cihan";
        String ad2="Suleyman";
        //tem.out.println(C03_Varargs.enUzunKelime(ad1, ad2));
        System.out.println(enUzunKelime(ad1, ad2));
        //parent child iliskisi varsa static method class ismi olmadan da cagrilir.
    }

}
