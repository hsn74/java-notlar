package free.DoWhileKacGunYeter;

public class DoWhileKacGunYeter {

         /*
Adada yalnız bir maymun var Her gün 4 muz yemesi gerekiyor o adada sadece 165 muz var
Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
int MuzSayısı =165, hayatta kalmaDays = 0;
 boolean maymunAlive = true;
*/

//Maymunun kac gun hayatta kalacagini gosteren kod
//Hayatta kaldigi suerece muz vermelisin
//(DO While)
//eger 4 ten az muz kalirsa maymunlar olur
    public static void main(String[] args) {
        int muzSayisi=165;
        Double hayattakalmaGunu = Double.valueOf(1);
        boolean maymunYasam = true;
            do {
                muzSayisi -= 4; //her gun 4 muz eksiltir
                hayattakalmaGunu++;

                if(muzSayisi<4){
                    maymunYasam = false;
                    System.out.println("bugun  "+(hayattakalmaGunu)+ " gun yasayamadi muz kalmadi.Maymun oldu");
                } else System.out.println("bugun "+hayattakalmaGunu+" gun yasadi Muz bitmedi.Maymun hayatta");

            }while(maymunYasam);
            System.out.println("Toplam maymunun yasadigi gun sayisi "+(hayattakalmaGunu));


        }
    }


