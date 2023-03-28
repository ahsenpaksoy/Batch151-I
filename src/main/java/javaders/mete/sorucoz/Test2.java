package javaders.mete.sorucoz;

public class Test2 {
    public static void main(String args[]){
        Test1 t= new Test1(11.5,7,9);
        System.out.println(t.isPower());
        t.powerSwitch();
        System.out.println(t.isPower());
        System.out.println(t.channelTuning(2));
    }
}
