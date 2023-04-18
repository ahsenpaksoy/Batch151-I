package javaders.lambdasulehoca;

public class Universite {

    private String name;
    private String bolumAdi;
    private int ogrenciSayisi;
    private int notOrtalamasi;

    public Universite() { //parametresiz cons.
    }

    public Universite(String name, String bolumAdi, int ogrenciSayisi, int notOrtalamasi) {
        this.name = name;
        this.bolumAdi = bolumAdi;
        this.ogrenciSayisi = ogrenciSayisi;
        this.notOrtalamasi = notOrtalamasi;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBolumAdi() {
        return bolumAdi;
    }
    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }
    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }
    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }
    public int getNotOrtalamasi() {
        return notOrtalamasi;
    }
    public void setNotOrtalamasi(int notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "name='" + name + '\'' +
                ", bolumAdi='" + bolumAdi + '\'' +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", notOrtalamasi=" + notOrtalamasi +
                '}';
    }
}
