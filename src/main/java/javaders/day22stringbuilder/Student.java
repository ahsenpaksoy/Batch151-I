package javaders.day22stringbuilder;

public class Student {

    //stdName public oldugu icin diger class'lardan ulasilabilir.
    //Ayni package de public ve default un bir farki olmaz
    public String stdName = "Ali Can";

    //Acceess Modifier'i "default" olan ile "public" olan class member'lar ayni package icinde
    //kullanildiklarinda ayni ozellikleri gosterirler.
    //Fakat farkli package'e gectiginizde "public" olanlara ulasilabilir, "default" olanlara ulasilamaz.
    int age = 23; // Access modifier'i default


    //Acceess Modifier'i "private" olan Class Member'lar sadece olusturulduklari class icinden gorulebilirler.
    //Olusturulduklari class'in disina ciktiginizda gorunmez, ulasilmz olurlar.
    private String healthCondition = "Cancer";

    //Acceess Modifier'i "protected" olan Class Member'lar ayni package icinde iken "public" gibi davranirlar.
    //Farkli package'a gectiginizde "protected" olanlar sadece child class'lardan gorulebilir.
    protected int salary = 3000;

    //Note : Class'lar public ve default olabilir ama private ve protected olamazlar.




}
