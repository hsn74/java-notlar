package ders23_Constructor;

public class HAraba {
    String marka="marka belirtilmedi";
    String model="model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;
    public HAraba(String mrk,String mdl, String ykt, int yl,int fyt){
        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;

    }
    public HAraba(String mrk,String mdl,int yl){
        //istersek parametreleri const da atayabiliriz.
        marka=mrk;
        model=mdl;
        yil=yl;
    }
    public HAraba(){
        //gorunur durumdaki parametresiz constructor
        //default constructor degildir
        //default const in bodysi de bos olur
        // ancak parametresiz const da body e kod yazilabilir
        //parametresiz const in bodysinde kod yoksa default const ile ayni islevi görür
        //ama yine de gorunur durumda ise default const denmez


    }

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

