package ders23_Constructor;

public class HArabaRunner {
    public static void main(String[] args) {
        HAraba arb1=new HAraba();
        arb1.marka="Toyota";
        arb1.model="Corolla";
        arb1.yakit="Dizel";
        arb1.yil=2010;
        arb1.fiyat=120000;
        System.out.println(arb1);
        HAraba arb2=new HAraba("Honda","Civic","Benzin",2011,110000);
        HAraba arb3=new HAraba("opel","corsa","dizel",2013,100000);
        System.out.println(arb3);
        HAraba arb4=new HAraba("tesla","x",2020);
        System.out.println(arb4);


    }

}
