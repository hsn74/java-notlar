package free.DoWhileKacGunYeter;

public class DoWhileKacGunYeter1 {

    /*
Tarlada bir inek var Her gün 10 kilo yem  yemesi gerekiyor ve tarlada 1200 ton yem var.
Aşağıdaki değişkenleri oluşturun ve ineğin kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
int yemAgirlik =1200, hayattakalmaSuresi = 0;
boolean inekYasam = true;
*/
//(DO While)
//eger 10 kg azyem verilirse inekler olur.
    public static void main(String[] args) {
        int toplam=1024;
        int kalaninternet = 0;
        boolean devam  = true;
        do {
            kalaninternet -= 10; //her gun 4 muz eksiltir
            kalaninternet++;

            if(kalaninternet<10){
                devam = false;
                System.out.println("bugun  "+(kalaninternet)+ " gun yasayamadi muz kalmadi.Maymun oldu");
            } else System.out.println("bugun "+kalaninternet+" gun yasadi Muz bitmedi.Maymun hayatta");

        }while(devam);
        System.out.println("Toplam maymunun yasadigi gun sayisi "+(kalaninternet));


    }
}
