package javaders.day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{

    /*
       Eger RunTime Custom Exception uretmek isterseniz RunTimeException Class'a extend etmelisiniz
     */

    public IllegalAgeException(){ //boyle yazinca console'a msj yazdirmayi dusunmuyoruz
        super();
    }

    public IllegalAgeException(String message){ //boyle yazinca console'a msj yazdiriyor.
        super(message);
    }


}
