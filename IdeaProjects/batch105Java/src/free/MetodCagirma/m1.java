package free.MetodCagirma;

public class m1 {
    /*input olarak verilen musteri satıs fiyatı,musteri karti var mi, uyeliği kac yıllık
    uye degilse &5 indirim
    uyeliği varsa 5 yıldan az ise %10 indirim
    uyeliği varsa 5 yıldan cok ise %15 indirim
    asil fiyat , indirimli fiyat yazdiran bir metod olustur
     */
    public static void main(String[] args) {
        boolean uyeMi=true;
        double uyelikYili=3;
        int satisFiyati=250;
        indirimliFiyatHesapla(uyeMi,uyelikYili,satisFiyati);


    }
    public static void indirimliFiyatHesapla(boolean uyeMi,double uyelikYili,int satisFiyati){
        if(uyeMi){
            if(uyelikYili<5){
                System.out.println("urun fiyati:"+satisFiyati);
                System.out.println("indirimFiyati:"+satisFiyati*0.1);
                System.out.println("indirimli fiyat:"+(satisFiyati-satisFiyati*0.1));

        }else {
            System.out.println("urun fiyati:" + satisFiyati);
            System.out.println("indirimFiyati:" + satisFiyati * 0.05);
            System.out.println("indirimli fiyat:" + (satisFiyati - satisFiyati * 0.05));
        }

        }else{
            System.out.println("urun fiyati:"+satisFiyati);
            System.out.println("indirimFiyati:"+satisFiyati*0.05);
            System.out.println("indirimli fiyat:"+(satisFiyati-satisFiyati*0.05));


}}
}


