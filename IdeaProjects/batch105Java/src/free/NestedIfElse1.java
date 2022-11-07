package free;

public class NestedIfElse1 {
    public static void main(String[] args) {
        int urunAdedi=40;
        boolean kartVarMi=false;
        double listeFiyati=12.5;
        double toplamFiyat=0;
        if(kartVarMi){
            if (urunAdedi<0) {
                System.out.println("hatali urun");
            } else if (urunAdedi<10) {
                if (kartVarMi == true && urunAdedi < 10) {
                    toplamFiyat = urunAdedi * listeFiyati * (0.85);
                    System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat);
                } else {
                    toplamFiyat = urunAdedi * listeFiyati * (0.80);
                    System.out.println("%20 indirimli toplam fiyat:" + toplamFiyat);
                }
            }else {
                if(kartVarMi){
                    if (urunAdedi<0) {
                        System.out.println("hatali urun");
                    } else if (urunAdedi<10) {
                        if (kartVarMi == false && urunAdedi < 10) {
                            toplamFiyat = urunAdedi * listeFiyati * (0.85);
                            System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat);
                        } else {
                            toplamFiyat = urunAdedi * listeFiyati * (0.80);
                            System.out.println("%20 indirimli toplam fiyat:" + toplamFiyat);

            }
                    }
                }

            }
        }
    }
}
