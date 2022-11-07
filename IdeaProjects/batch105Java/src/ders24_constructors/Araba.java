package ders24_constructors;

public class Araba {
    String marka = "marka belirtilmedi";
    String model = "model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;
    public Araba(String mrk,String mdl){
        marka=mrk;
        model=mdl;
}

    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public Araba(){

}

    @Override
    public String toString() {
        return "Araba Ozellikleri" +
                "\n marka=" + marka +
                "\n model=" + model +
                "\n yakit=" + yakit  +
                "\n yil=" + yil +
                "\n fiyat=" + fiyat;
    }
}
