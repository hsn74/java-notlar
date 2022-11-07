package ders11_stringManipulation;

public class C07_Soru {
    public static void main(String[] args) {


    String isim="Mehmet";
    String soyisim=" HarunGil";
    String yeniIsimSoyIsim;
    if(isim.length()>soyisim.length()) {
        String yeniIsimSoyisim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase() +
                "" +
                soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).toLowerCase();
    }else{
        yeniIsimSoyIsim=isim.substring(0,1).toUpperCase() +
                isim.substring(1).toLowerCase() +
                "" +
                soyisim.toUpperCase();

        System.out.println(yeniIsimSoyIsim);


    }
}
}
