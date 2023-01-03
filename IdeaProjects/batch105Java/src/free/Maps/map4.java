package free.Maps;

import ders44_maps.MapDepo;

import java.util.List;
import java.util.Map;

public class map4 {
    public static void main(String[] args) {
        //ogrenci mapde numarasi verilen sayilarin arasinda sınırlar dahil olan ogrencilerin
        // 105 den buyuk olanların
        //isim soy isim ve bolumlerini LİST olarak yaz dondur
        Map<Integer, String> ogrenciMap= MapDepo.ornekMapOlustur();
        int basNo=103;
        int bitNo=107;
        List<String>isimListesi=MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);

    }
}
