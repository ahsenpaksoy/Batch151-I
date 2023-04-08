package javaders.mete.practice;

public class Subclass extends SuperClass {
    String ayni ="sub field";
    public void talk() {
        System.out.println("sub class");

    }

    public void talk2() {
        System.out.println("sub class takl2");

    }

    public static void main(String[] args) {

        SuperClass superObj = new Subclass();
        Subclass subObj = new Subclass();

        superObj.talk();
        subObj.talk();

        superObj.talk1();

        System.out.println(superObj.ayni);
        System.out.println(subObj.ayni);


    }
}
