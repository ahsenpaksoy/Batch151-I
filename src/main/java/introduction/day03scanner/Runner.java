package introduction.day01variables.day03scanner;

public class Runner {
    public static void main(String[] args) {

        //Object nasil olusturulur?
        //Class ismi + Object ismi + Atama Operatoru + "new" + Constructor

        Car myCar = new Car();

        //"new" keyword u sifirdan yeni bir object olusturmak icin kullanilir.
        //Contructor java da nesneleri olusturmak icin kullanilan ozel bir method dur.

        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        System.out.println();

        Student tomHanks = new Student();
        System.out.println(tomHanks.name);  //tomHanks.sout  + enter
        System.out.println(tomHanks.grade);
        System.out.println("tomHanks.address = " + tomHanks.address);  //tomHanks.address.soutv + enter
        tomHanks.feed();
        tomHanks.study();


    }
}
