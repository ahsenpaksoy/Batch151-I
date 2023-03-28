package javaders.mete.o2;

public class Diktorgen implements geometri{
    private final double kenar2;
    private final double kenar1;

    @Override
    public double alan() {
        return this.kenar1*this.kenar2;
    }

    @Override
    public double cevre() {
        return 2*this.kenar1+2*this.kenar2;
    }

    public Diktorgen(double kenar1, double kenar2) {
        this.kenar1 =kenar1;
        this.kenar2 =kenar2;
    }
}
