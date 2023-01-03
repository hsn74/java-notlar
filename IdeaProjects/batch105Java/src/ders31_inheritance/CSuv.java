package ders31_inheritance;

public class CSuv extends  BinekArac{
    private String plaka;
    private boolean yakit;

    public static void main(String[] args) {
        CSuv suv1=new CSuv();
        System.out.println(suv1.marka);//Binek araclarin markasi vardir
        System.out.println(suv1.model);//Binek araclarin modeli olur
        System.out.println(suv1.plaka);//Tum araclar plakasi olur
        System.out.println(suv1.yakit);//Araclar farkli yakit kullanir
        System.out.println(suv1.yil);//1900
        suv1.hiz();//binek araclarin hizi modele göre degisir
        suv1.teker();//binek araclarin 4 tekeri olur
        CSuv suv2=new CSuv();
        suv2.marka="Toyota";
        suv2.model="HRV";
        suv2.plaka="06 ANK 006";
        suv2.yil=2012;
    }
    public void hiz(String yakit){
        if(yakit.equalsIgnoreCase("benzin")) {
            System.out.println("benzinlik SUVler max 300km hiz yapar");
        }else if (yakit.equalsIgnoreCase("Dizel")){
            System.out.println("Dizel SUV lar max 260 km hiz yapar");
        }else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("hibrit SUV lar max 220 km hiz yapar");
        }else {
            System.out.println("Byakit belli degil max hiz soyliyemem");
        }
    }
}
