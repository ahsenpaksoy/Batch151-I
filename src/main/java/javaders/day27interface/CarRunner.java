package javaders.day27interface;

public class CarRunner {
    public static void main(String[] args) {

        Engine.stop(); //stop() method'u static oldugundan "interface" ismi ile ulastim.

       // Engine e = new Engine(); //interface'lerde object olusturulamaz.
        Honda h = new Honda();
        h.eco(); //eco() method'u static olmadigindan(default method) "object" ismi ile ulastim.
    }
}

  //interface'deki yarim method'lardan dolayi(body'si olmadigi icin) burada object olusturulamaz.
  //object'yi child'da olustururuz. O yuzden honda'ya geldik.
