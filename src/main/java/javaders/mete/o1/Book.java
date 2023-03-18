package javaders.mete.o1;

public class Book {

    private String bName;
    private  String yName;

    public Book(String bName, String yName) {

        this.bName = bName;
        this.yName = yName;

    }

    public void kitabiYaz(){
        System.out.println(this.bName + " by " +this.yName);
    }

    public String getbName() {
        return bName;
    }

    public String getyName() {
        return yName;
    }

    public void setyName(String yName) {
        this.yName = yName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }
}

