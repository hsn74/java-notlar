package ders23_Constructor;

public class DArabaRunner {
    public static void main(String[] args) {
        //araba class indan bir obje olustur
        DAraba arb1 = new DAraba();
        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);
        arb1.marka = "Tofas";
        arb1.model = "Kartal";
        arb1.yakit = "Benzin";
        arb1.fiyat = 50000;
        arb1.yil=1991;
        arb1.maxHiz(arb1.yakit);
        System.out.println(arb1.marka);
        System.out.println(arb1.model);
        System.out.println(arb1.yakit);
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);
        System.out.println(arb1.maxHiz(arb1.yakit));
        DAraba arb2=new DAraba();
        DAraba arb4=new DAraba();
        //arb 2 nin özelliklerini yazdir
        System.out.println("markas:"+ arb2.marka+
                            "\n model:"+arb2.model+
                            "\nYakit:"+arb2.yakit+
                             "\nYil:"+ arb2.yil+
                            "\n fiyat:"+arb2.fiyat);
        DAraba arb3=new DAraba();
        System.out.println(arb3);
        System.out.println(arb1);
        System.out.println(arb4);

    }
}
