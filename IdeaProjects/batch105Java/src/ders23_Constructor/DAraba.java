package ders23_Constructor;

public class DAraba {
    //bazi classlari bir proje olusturulurken tüm claslarda main metod olmasina gerek yoktur.
    //cogu class obje olusturularak kullanılmak uzere hazırlanmıs depolardır
    //biz de classi araba objeleri için depo olarak dizayn edelim
    //HER CLASS olusturuldugunda java o class dan obje olusturulabilmesi için default constructor olusturur
    //default cons parametresizdir ve bize standart bir yapi olusturur
    String marka="marka belirtilmedi";
    String model="model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    @Override
    public String toString() {
        return "DAraba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakit='" + yakit + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }

    public int maxHiz(String yakit){
        int maxHiz=120;
        if(yakit.equalsIgnoreCase("dizel")) {
            maxHiz = 230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
            
        }
        return maxHiz;

        }
    }
