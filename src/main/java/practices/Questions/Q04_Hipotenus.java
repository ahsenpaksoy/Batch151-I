package practices.Questions;

public class Q04_Hipotenus {

    //Hipotenüs hesaplayan bir kod yazınız

    public static void main(String[] args) {

        //Math.sqrt(16);  degerin karekokunu alir
        //System.out.println( Math.sqrt(16));

        System.out.println(hipotenusHesapla(6,8));

    }

    public static double hipotenusHesapla(double dikKenar1, double dikKenar2){
        double hipotenus =  Math.sqrt(dikKenar1*dikKenar1+dikKenar2*dikKenar2);

        return hipotenus;
    }
}
