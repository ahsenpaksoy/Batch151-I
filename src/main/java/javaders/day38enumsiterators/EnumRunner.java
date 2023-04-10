package javaders.day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {

        String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);

       String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);

        UsStatesEnum state = UsStatesEnum.ALASKA;
        System.out.println();
        //Data tipi enum'in kendisi olmali.Enum'daki data'yi get method olusturmadan
        // kullanirsaniz Data tipi enum'in kendisi olmali

        String stateName = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);

        String abbreviationOfAlaska = UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);


    }
}
