package free.ifElse;

public class IfElseStatments {
    public static void main(String[] args) {
        int urunAdedi=30;
        boolean kartVarMi = true;
        double listeFiyati=12.5;
        double toplamFiyat=0;
        if(kartVarMi==true && urunAdedi>=10) {
            toplamFiyat = (urunAdedi * listeFiyati)* (0.8);
            System.out.println("%20 indirimli fiyat :" + toplamFiyat);
        } else if (kartVarMi== false && urunAdedi>10) {
            toplamFiyat = urunAdedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli fiyat :" + toplamFiyat);
        } else if (kartVarMi&&urunAdedi<10 && urunAdedi>0) {
            toplamFiyat = urunAdedi * listeFiyati * (0.90);
            System.out.println("%10 indirimli fiyat :" + toplamFiyat);
        }else {
            System.out.println("gecersiz giris");
        }



    }


}

