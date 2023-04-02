package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse); //[Milk, Meat, Bread, Egg, Cheese]
        //Queue elemanlari verilen siraya gore dizdi. Cunku constructor olarak LinkedList kullandik
        //LinkedList elemanlari bizim verdigimiz siraya gore dizdigi icin Queue da LinkedList'den dolayi ona gore dizmek zorunda kaldi.

        wareHouse.remove(); //Ilk elemani siler.
        System.out.println(wareHouse); //[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek()); //Meat
        System.out.println(wareHouse); //[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element()); //Meat
        System.out.println(wareHouse); //[Meat, Bread, Egg, Cheese]

        //Queue'da eleman varsa peek ve element ilk elemani verir. Eleman yoksa bossa peek null verir, element hata verir.

        System.out.println(wareHouse.poll()); //Meat  Ilk elemani verir ve sonra siler. Boslar icin null verir.
        System.out.println(wareHouse); //[Bread, Egg, Cheese]

        wareHouse.clear();

        System.out.println(wareHouse.poll()); //null
        System.out.println(wareHouse.remove()); //Exeption


    }

}
